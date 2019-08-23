package za.co.pblinfrastructures.site.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @ResponseBody()
    @RequestMapping("/")
    public String index(){
     return "home/index";
    }
}
