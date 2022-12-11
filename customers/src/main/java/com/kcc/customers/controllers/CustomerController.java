package com.kcc.customers.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {



    @GetMapping("/")
    public String retrieveLimits(){
        return null;
    }
}
