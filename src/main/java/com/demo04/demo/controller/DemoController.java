package com.demo04.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DemoController {


    @GetMapping
    public String PruebaString(){
        return "esto es una prueba";
    }
}
