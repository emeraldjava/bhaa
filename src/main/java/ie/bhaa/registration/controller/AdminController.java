package ie.bhaa.registration.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import ie.bhaa.registration.domain.Runner;
import ie.bhaa.registration.enumeration.Page;
import org.apache.log4j.Logger;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.PostConstruct;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by pauloconnell on 26/06/15.
 */
@Controller
@RequestMapping("/admin")
public class AdminController implements ResourceLoaderAware {

    private Logger logger = Logger.getLogger(AdminController.class);
    private String DYNAMIC_FOLDER = "/dynamic";
    private String MEMBERS_JSON = "members.json";

    private File folder;
    private ResourceLoader resourceLoader;

    @RequestMapping("/")
    public String index(Map<String, Object> model) {
        model.put("file", "Filename.json");
        model.put("menu",Page.values());
        return "member";
    }

    @RequestMapping("/loadFile")
    public String loadFile(Map<String, Object> model) throws Exception {
        writeFile(getRunners());
        model.put("menu",Page.values());
        logger.info("loadFile");
        return "/admin";
    }

    @RequestMapping("/clearallfiles")
    public String clearallfiles(Map<String, Object> model) {
        model.put("menu",Page.values());
        logger.info("clearallfiles");
        return "/admin";
    }

    private String writeFile(List<Runner> list) throws Exception {
        File folder = this.resourceLoader.getResource("file:dynamic").getFile();
        logger.info(folder.getAbsolutePath());
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File(folder,MEMBERS_JSON), list);
        return MEMBERS_JSON;
    }

    private List<Runner> getRunners() {
        List<Runner> list = new ArrayList<Runner>();
        list.add(new Runner(1000l,"Paul","B1"));
        list.add(new Runner(2000l,"Pat","B2"));
        list.add(new Runner(3000l,"Paaut","B3"));
        list.add(new Runner(4000l,"Jacobe","B4"));
        list.add(new Runner(1100l,"xPaul","B1"));
        list.add(new Runner(2100l,"xPat","B2"));
        list.add(new Runner(3100l,"xPaaut","B3"));
        list.add(new Runner(4100l,"xJacobe","B4"));
        return list;
    }

    @ExceptionHandler(Exception.class)
    public ModelAndView handleAllException(Exception ex) {
        ModelAndView model = new ModelAndView("error/generic_error");
        model.addObject("errMsg", ex.getMessage());
        logger.error(ex);
        return model;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader=resourceLoader;
    }
}
