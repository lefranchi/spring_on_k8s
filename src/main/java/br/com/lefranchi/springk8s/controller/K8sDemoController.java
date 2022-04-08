package br.com.lefranchi.springk8s.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class K8sDemoController {

    @GetMapping("/")
    public String hello() {
        return "Hello World---";
    }

}
