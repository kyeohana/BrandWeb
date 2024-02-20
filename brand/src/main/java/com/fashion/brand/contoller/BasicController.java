package com.fashion.brand.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class BasicController {

    @RequestMapping("/index")
    public String main() {
        return "index.html";
    }

    @RequestMapping("/intro")
    public String home() {
        return "intro.html";
    }
    
}