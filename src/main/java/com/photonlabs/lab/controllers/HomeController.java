package com.photonlabs.lab.controllers;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {
        @RequestMapping("/index")
        public String show(Model view){
            return"index";
        }
}
