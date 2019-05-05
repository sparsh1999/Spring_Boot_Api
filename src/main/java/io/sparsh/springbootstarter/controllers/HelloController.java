package io.sparsh.springbootstarter.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// restcontroller specifies that this class is a controler
// Controller class is one which manages which url to link to which method

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String sayHi(){
        return "HELLO";
    }

}
