package com.aicamp.analyze.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/titanic")
    public String titanic() {
        return "titanic";
    }

    @GetMapping("/dog-cat")
    public String upload() {
        return "upload";
    }
}