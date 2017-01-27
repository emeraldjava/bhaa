package ie.bhaa.registration.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import ie.bhaa.registration.dto.MembershipData;
import ie.bhaa.registration.dto.Runner;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by pauloconnell on 27/01/17.
 */
@Component
@ConfigurationProperties
public class MembershipFileServiceBean implements MembershipFileService, ResourceLoaderAware {

    private Logger logger = Logger.getLogger(MembershipFileServiceBean.class);

    @Value("${url}")
    private String url;

    private String FILE_DYNAMIC = "file:dynamic";
    private String MEMBERS_JSON = "members-list.json";

    private ResourceLoader resourceLoader;
    private File folder;

    @PostConstruct
    public void loadFolder() {
        try {
            logger.info("MembershipFileServiceBean - init");
            this.folder = this.resourceLoader.getResource(FILE_DYNAMIC).getFile();
            logger.info(folder.getAbsolutePath());
        }catch(Exception e){
            logger.error(e);
        }
    }

    public String getUrl(){
        return url;
    }

    public void setUrl(){
        this.url = url;
    }

    @Override
    public String getMembershipFile() {
        logger.info(getUrl());
        return getUrl();
    }

    @Override
    public void reloadMembershipFile() {
        RestTemplate restTemplate = new RestTemplate();
        MembershipData membershipData = restTemplate.getForObject(getUrl(), MembershipData.class);
        //System.out.print(quote);
        //loadFolder();
        logger.info(membershipData.getCount());
        logger.info(membershipData.getRunners().size());
        try {
            writeFile(membershipData.getRunners(),membershipData.getDate());
        } catch(Exception e){
            logger.error(e);
            e.printStackTrace();
        }
    }

    @Override
    public void clearMembershipFile() {
        try {
            //loadFolder();
            Files.walk(Paths.get(folder.toURI()))
                    .filter(Files::isRegularFile)
                    //.filter(Path::toString().endswith(".json"))
                    .map(Path::toFile)
                    .forEach(File::delete);
        } catch(IOException ioe) {
            logger.error(ioe);
            ioe.printStackTrace();
        }
    }

    private String writeFile(List<Runner> list,String date) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        File file = new File(this.folder,"members-list-"+date+".json");
        mapper.writeValue(file,list);
        logger.info(file.getAbsolutePath());
        return MEMBERS_JSON;
    }

    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }
}
