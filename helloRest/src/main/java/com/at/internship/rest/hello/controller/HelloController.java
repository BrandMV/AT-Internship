package com.at.internship.rest.hello.controller;

import com.at.internship.rest.hello.dto.HelloDto;
import com.at.internship.rest.hello.service.IPoliteSalutation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    //*Using the interface name
    //*Injecting bean
    @Autowired /* cant define as a final*/
    private IPoliteSalutation politeSalutation;

    //*Spring will use this setter to inject our bean politeSalutation
    //@Autowired
    /*public void setPoliteSalutation(IPoliteSalutation politeSalutation){
        this.politeSalutation = politeSalutation;
    }*/

    //*Injecting using constructor, recommended way to inject dependencies
    public HelloController(IPoliteSalutation politeSalutation){
        this.politeSalutation = politeSalutation;
    }

    @GetMapping("/world")
    public HelloDto hello(){
        return new HelloDto("Hello world");
    }

    @GetMapping("/polite")
    public HelloDto helloPolite(){
        return new HelloDto(politeSalutation.getPoliteSalutation());
    }
}
