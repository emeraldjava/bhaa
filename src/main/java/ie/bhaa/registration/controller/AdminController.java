package ie.bhaa.registration.controller;

import ie.bhaa.registration.enumeration.Page;
import ie.bhaa.registration.service.MembershipFileServiceBean;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * Created by pauloconnell on 26/06/15.
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    private Logger logger = Logger.getLogger(AdminController.class);

    @Autowired
    private MembershipFileServiceBean membershipFileService;

    @RequestMapping("/")
    public String index(Map<String, Object> model) {
        model.put("file", "Filename.json");
        model.put("menu", Page.values());
        return "member";
    }

    @RequestMapping("/loadFile")
    public String loadFile(Map<String, Object> model) throws Exception {
        logger.info("loadFile");
        membershipFileService.reloadMembershipFile();
        model.put("menu", Page.values());
        logger.info("loadFile");
        return "/admin";
    }

    @RequestMapping("/clearallfiles")
    public String clearallfiles(Map<String, Object> model) {
        model.put("menu", Page.values());
        membershipFileService.clearMembershipFile();
        logger.info("clearallfiles");
        return "/admin";
    }

    @ExceptionHandler(Exception.class)
    public ModelAndView handleAllException(Exception ex) {
        ModelAndView model = new ModelAndView("error/generic_error");
        model.addObject("errMsg", ex.getMessage());
        logger.error(ex);
        ex.printStackTrace();
        return model;
    }
}
