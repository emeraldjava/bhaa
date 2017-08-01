package ie.bhaa.registration.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by pauloconnell on 26/06/15.
 */
@Controller
//@RequestMapping("/idx")
public class IndexController {

    private Logger logger = Logger.getLogger(IndexController.class);

    @Value("${application.message:Hello World}")
    private String message = "Hello World";


    //static final String VIEW_INDEX = "pages/index";

    //@RequestMapping(value = "")
    //public String getHome() {
    //    return VIEW_INDEX;
    //}

    @RequestMapping("/")
    public String index(Map<String, Object> model) {
        return "pages/member";
    }
}
