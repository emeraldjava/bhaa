package ie.bhaa.registration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by pauloconnell on 17/02/17.
 */
@Controller
@RequestMapping("/res")
public class ResultsController {

    @RequestMapping("/")
    public String index(Map<String, Object> model) {
        return "pages/results";
    }
}
