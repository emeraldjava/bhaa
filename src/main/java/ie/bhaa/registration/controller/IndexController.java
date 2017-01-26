package ie.bhaa.registration.controller;

import ie.bhaa.registration.enumeration.Page;
import ie.bhaa.registration.service.RegistrationService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private RegistrationService registrationService;

    @RequestMapping("/")
    public String index(Map<String, Object> model) {
        model.put("time", new Date());
        model.put("message", this.message);
        model.put("menu",Page.values());
        return "index";
    }

    @RequestMapping("/member")
    public String member(Map<String, Object> model) {
        model.put("registeredRunners", registrationService.getRegisteredRunners());
        model.put("menu",Page.values());
        return "member";
    }

    @RequestMapping("/daymember")
    public String daymember(Map<String, Object> model) {
        model.put("registeredRunners", registrationService.getRegisteredRunners());
        model.put("menu",Page.values());
        return "daymember";
    }

    @RequestMapping("/list")
    public String list(Map<String, Object> model) {
        model.put("registeredRunners", registrationService.getRegisteredRunners());
        model.put("menu",Page.values());
        return "list";
    }

    @RequestMapping("/export")
    public String export(Map<String, Object> model) {
        model.put("menu",Page.values());
        return "export";
    }

    @RequestMapping("/prereg")
    public String prereg(Map<String, Object> model) {
        model.put("menu",Page.values());
        return "prereg";
    }

    @RequestMapping("/admin")
    public String admin(Map<String, Object> model) {
        model.put("menu",Page.values());
        return "admin";
    }
}
