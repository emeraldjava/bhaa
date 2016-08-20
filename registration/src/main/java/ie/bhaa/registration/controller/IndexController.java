package ie.bhaa.registration.controller;

import ie.bhaa.registration.domain.Runner;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by pauloconnell on 26/06/15.
 */
@Controller
public class IndexController {

    private Logger logger = Logger.getLogger(IndexController.class);

    @RequestMapping(value="/",method = RequestMethod.GET)
    //@RequestMapping("/")
    public String index() {
        System.out.println("IndexController");
        return "redirect:/index.html";
        //return "index";
    }

//    @RequestMapping(value="/",method = RequestMethod.GET)
//    public String homepage() {
//        System.out.println("IndexController");
//        return "index";
//    }


    /**
     * http://stackoverflow.com/questions/1483063/spring-mvc-3-and-handling-static-content-am-i-missing-something
     * @return
     */
//    @RequestMapping(value="/", method = RequestMethod.GET)
////    public ModelAndView index() {
//  //      return new ModelAndView("index.jsp");
//    public ModelAndView index() {
//        ModelAndView modelAndView = new ModelAndView("index");
//        modelAndView.getModel().put("greeting",new Runner());//1,"index"));
//        logger.info("index "+modelAndView);
//        return modelAndView;
//    }



//    @RequestMapping("/rest")
//    @RequestMapping(value = "/rest", method = RequestMethod.GET)
//    public @ResponseBody Runner getIndexPage() {
//        logger.info("rest");
//        return new Runner();//1,"name");
//    }

}
