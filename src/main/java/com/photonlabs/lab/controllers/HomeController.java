package com.photonlabs.lab.controllers;

//import ch.qos.logback.core.model.Model;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {
        @GetMapping("/")
        public String landingPage(Model view){
            return"index";
        }
//the request mapping should be the url
    @GetMapping("/calc")
    public String calc(Model view){
//            return should be the file
        return"subPages/calc";
    }

    @GetMapping("/konami")
    public String konami(Model view){
        return"subPages/konami";
    }

    @GetMapping("/favfoods")
    public String favFoods(Model view){
        return"subPages/foods";
    }

    @GetMapping("/weather")
    public String weather(Model view){
        return"subPages/weathermap";
    }
    @GetMapping("/coffee")
    public String coffee(Model view){
        return"subPages/coffee";
    }

    @GetMapping("/tut")
    public String tut(Model view){
//            return should be the file
        return"tut";
    }


}
