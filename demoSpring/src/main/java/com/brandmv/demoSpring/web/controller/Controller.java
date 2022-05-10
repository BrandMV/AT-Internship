package com.brandmv.demoSpring.web.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class Controller {
    /** Services */
    @GetMapping("/copyFile")
    public String copyFile(){
        return "File copied!";
    }

    @GetMapping("/myPage")
    public String myPage(){
        String string = "";
        string = string + "<!DOCTYPE html>";
        string = string + "<html>";
        string = string + "<head>";
        string = string + "<title>Brandon's web</title>";
        string = string + "</head>";
        string = string + "<body>";
        string = string + "<h1>Hello world</h1>";
        string = string + "<h3>Web developed using SpringBoot</h1>";
        string = string + "<body>";
        string = string + "</body>";
        string = string + "<html>";

        return string;
    }

    @GetMapping("/myPage2/{userName}/{sMsg}")
    public String myPage2(@PathVariable String userName, @PathVariable String sMsg){
        String string = "";
        string = string + "<!DOCTYPE html>";
        string = string + "<html>";
        string = string + "<head>";
        string = string + "<title>" + userName + "s web</title>";
        string = string + "</head>";
        string = string + "<body>";
        string = string + "<h1>" + sMsg + "</h1>";
        string = string + "<h2>Web developed using SpringBoot</h2>";
        string = string + "<body>";
        string = string + "</body>";
        string = string + "<html>";

        return string;
    }

    @GetMapping("/myPage3")
    public String myPage3(@RequestParam String userName, @RequestParam String sMsg){
        String string = "";
        string = string + "<!DOCTYPE html>";
        string = string + "<html>";
        string = string + "<head>";
        string = string + "<title>" + userName + "s web</title>";
        string = string + "</head>";
        string = string + "<body>";
        string = string + "<h1>" + sMsg + "</h1>";
        string = string + "<h2>Web developed using SpringBoot</h2>";
        string = string + "<body>";
        string = string + "</body>";
        string = string + "<html>";

        return string;
    }
}
