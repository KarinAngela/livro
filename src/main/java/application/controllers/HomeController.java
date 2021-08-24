package application.controllers;

import.org.springframework.stereotype.Controller;
import.org.springframework.web.bind.annotation.RequestMapping;
import.org.springframework.web.bind.annotation.Request.Method;

@Controller
public class HomeController {
    @RequestMapping(method=RequestiMethod.GET)
    public String index(){
        return "home/index.jsp";
    }




}