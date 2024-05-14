package ru.gb.spirng_hw_sem7.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

    @GetMapping("/home")
    public String home(){
        return "Home Page";
    }

    @GetMapping("/private-data")
    public String admin(){
        return "Admin Page";
    }

    @GetMapping("/public-data")
    public String user(){
        return "User Page";
    }
}
