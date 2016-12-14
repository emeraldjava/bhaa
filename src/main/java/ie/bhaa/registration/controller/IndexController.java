package ie.bhaa.registration.controller;

import ie.bhaa.registration.service.RegistrationService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private RegistrationService registrationService;

    private Map menu;

    @PostConstruct
    private Map loadMenu() {
        menu = new LinkedHashMap<>();
        menu.put("member","Members");
        menu.put("daymember","Day Members");
        menu.put("list","List");
        //menu.put("export","Export");
        return menu;
    }

    @RequestMapping("/")
    public String index(Map<String, Object> model) {
        model.put("time", new Date());
        model.put("message", this.message);
        model.put("menu",menu);
        return "index";
    }

    @RequestMapping("/member")
    public String member(Map<String, Object> model) {
        model.put("registeredRunners", registrationService.getRegisteredRunners());
        model.put("menu",menu);
        return "member";
    }

    @RequestMapping("/daymember")
    public String daymember(Map<String, Object> model) {
        model.put("registeredRunners", registrationService.getRegisteredRunners());
        model.put("menu",menu);
        return "daymember";
    }

    @RequestMapping("/list")
    public String list(Map<String, Object> model) {
        model.put("registeredRunners", registrationService.getRegisteredRunners());
        model.put("menu",menu);
        return "list";
    }
}
