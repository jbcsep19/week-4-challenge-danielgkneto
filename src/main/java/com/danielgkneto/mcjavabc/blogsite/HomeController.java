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
        return "redirect:/";
    }

    @RequestMapping("/algorithms")
    public String algorithms() {
        return "redirect:/";
    }

    @RequestMapping("/core-java")
    public String coreJava() {
        return "redirect:/";
    }

    @RequestMapping("/oop-java")
    public String oOPJava() {
        return "redirect:/";
    }

    @RequestMapping("/html-css")
    public String htmlCss() {
        return "redirect:/";
    }

    @RequestMapping("/git-branch")
    public String gitBranch() {
        return "git-branch";
    }

    @RequestMapping("/git-setup")
    public String gitSetup() {
        return "git-setup";
    }
}
