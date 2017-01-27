package ie.bhaa.registration.controller;

import ie.bhaa.registration.enumeration.Page;
import ie.bhaa.registration.form.RunnerForm;
import ie.bhaa.registration.service.MembershipFileServiceBean;
import ie.bhaa.registration.service.RegistrationService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
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
    @Autowired
    private MembershipFileServiceBean membershipFileService;

    @RequestMapping("/")
    public String index(Map<String, Object> model) {
        model.put("time", new Date());
        model.put("message", this.message);
        model.put("menu",Page.values());
        return "index";
    }

    @GetMapping("/member")
    public String member(Model model){//Map<String, Object> model) {
        model.addAttribute("registeredRunners", registrationService.getRegisteredRunners());
        model.addAttribute("memberFileName", membershipFileService.getMembershipFile());
        logger.info("memberFileName -> "+membershipFileService.getMembershipFile());
        model.addAttribute("runnerForm", new RunnerForm());
        model.addAttribute("menu", Page.values());
        return "member";
    }

    /**
     *
     * http://stackoverflow.com/questions/11651769/spring-3-mvc-is-it-possible-to-have-a-spring-form-without-commandname-binding
     * @param greeting
     * @return
     */
    @PostMapping("/enterMember")
    public String greetingSubmit(@ModelAttribute RunnerForm runnerForm) {
        // this way you get value of the input you want
        //String pathValue1 = runnerForm.getParameter("bhaa_runner");
        logger.info("enter BHAA ID "+runnerForm.getId()+" "+runnerForm.toString());
        return "redirect:/list";
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
