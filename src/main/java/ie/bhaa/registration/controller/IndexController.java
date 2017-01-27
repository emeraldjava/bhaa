package ie.bhaa.registration.controller;

import ie.bhaa.registration.enumeration.Page;
import ie.bhaa.registration.form.RaceEntry;
import ie.bhaa.registration.service.MembershipFileServiceBean;
import ie.bhaa.registration.service.RegistrationService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    public String member(Model model) {
        model.addAttribute("memberFileName", membershipFileService.getMembershipFile());
        logger.info("memberFileName -> "+membershipFileService.getMembershipFile());
        model.addAttribute("runnerForm", new RaceEntry());
        model.addAttribute("menu", Page.values());
        return "member";
    }

    @RequestMapping("/daymember")
    public String daymember(Model model) {
        model.addAttribute("runnerForm", new RaceEntry());
        model.addAttribute("menu", Page.values());
        return "daymember";
    }

    /**
     * Enter a raceEntry and redirect to the list.
     */
    @PostMapping("/raceEntry")
    public String enterAthlete(@ModelAttribute RaceEntry raceEntry) {
        logger.info("enter BHAA ID "+ raceEntry.getId()+" "+ raceEntry.getRacenumber()+" "+ raceEntry.getMoney());
        registrationService.registerRaceEntry(raceEntry);
        return "redirect:/list";
    }

    @RequestMapping("/list")
    public String list(Map<String, Object> model) {
        model.put("registeredRunners", registrationService.getRegisteredRunners());
        model.put("menu",Page.values());
        return "list";
    }

    /**
     * http://stackoverflow.com/questions/5673260/downloading-a-file-from-spring-controllers
     * @param model
     * @return
     */
    @RequestMapping(value="/export",method = RequestMethod.GET,produces = MediaType.APPLICATION_OCTET_STREAM_VALUE)
    @ResponseBody
    public HttpEntity<byte[]> export(Map<String, Object> model) {
        model.put("menu",Page.values());

        String fileName = "export.csv";
        String fileContent = "blah,blah";
        byte[] documentBody = fileContent.getBytes();

        HttpHeaders header = new HttpHeaders();
        header.setContentType(MediaType.TEXT_PLAIN);
        header.set(HttpHeaders.CONTENT_DISPOSITION,
                "attachment; filename=" + fileName.replace(" ", "_"));
        header.setContentLength(documentBody.length);

        return new HttpEntity<byte[]>(documentBody, header);
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
