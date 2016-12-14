package ie.bhaa.registration.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;
import java.util.*;

/**
 * Created by pauloconnell on 26/06/15.
 */
@Controller
public class IndexController {

    private Logger logger = Logger.getLogger(IndexController.class);

    @Value("${application.message:Hello World}")
    private String message = "Hello World";

    private Map menu;

    @RequestMapping("/")
    public String index(Map<String, Object> model) {
        model.put("time", new Date());
        model.put("message", this.message);
        model.put("menu",menu);
        return "index";
    }

    @PostConstruct
    private Map loadMenu() {
        menu = new HashMap<>();
        menu.put("member","Members");
        menu.put("day","Day Members");
        menu.put("list","List");
        menu.put("export","Export");
        return menu;
    }
}
