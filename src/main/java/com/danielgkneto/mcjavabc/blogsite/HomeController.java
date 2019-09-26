package com.danielgkneto.mcjavabc.blogsite;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @RequestMapping("/boot-camp")
    public String bootCamp() {
        return "boot-camp";
    }

    @RequestMapping("/author")
    public String author() {
        return "author";
    }

    @RequestMapping("/github")
    public String github() {
        return "github";
    }

    @RequestMapping("/algorithms")
    public String algorithms() {
        return "algorithms";
    }

    @RequestMapping("/core-java")
    public String coreJava() {
        return "core-java";
    }

    @RequestMapping("/oop-java")
    public String oOPJava() {
        return "oop-java";
    }

    @RequestMapping("/html-css")
    public String htmlCss() {
        return "html-css";
    }
}
