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
    private ResourceLoader resourceLoader;
    private File folder;
    private String memberFileName;

    @PostConstruct
    public void loadFolder() {
        try {
            this.folder = this.resourceLoader.getResource(FILE_DYNAMIC).getFile();
            logger.info("MembershipFileServiceBean - init " + folder.getAbsolutePath());
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
        return "dynamic/members-list-2017-01-27.json";// "dynamic/"+this.memberFileName;
    }

    @Override
    public void reloadMembershipFile() {
        RestTemplate restTemplate = new RestTemplate();
        MembershipData membershipData = restTemplate.getForObject(getUrl(), MembershipData.class);
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
            Files.walk(Paths.get(folder.toURI()))
                    .filter(Files::isRegularFile)
                    .map(Path::toFile)
                    .forEach(File::delete);
        } catch(IOException ioe) {
            logger.error(ioe);
            ioe.printStackTrace();
        }
    }

    private void writeFile(List<Runner> list,String date) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        this.memberFileName = "members-list-"+date+".json";
        File file = new File(this.folder,this.memberFileName);
        mapper.writeValue(file,list);
        logger.info(file.getAbsolutePath());
    }

    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }
}
