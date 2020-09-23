package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
//    thymeleaf looks for this
    @RequestMapping({"","/","index", "index.html"})
    public String index() {

        return "index";
    }
}