package ie.bhaa.registration.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.Map;

/**
 * Created by pauloconnell on 26/06/15.
 */
@Controller
public class IndexController {

    private Logger logger = Logger.getLogger(IndexController.class);

    @Value("${application.message:Hello World}")
    private String message = "Hello World";

    @RequestMapping("/")
    public String index(Map<String, Object> model) {
        model.put("time", new Date());
        model.put("message", this.message);
        return "index";
    }
}
