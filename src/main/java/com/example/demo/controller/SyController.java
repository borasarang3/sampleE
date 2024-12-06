package com.example.demo.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log4j2
@RequiredArgsConstructor
@RequestMapping("/sy")
public class SyController {

    @GetMapping("/register")
    public String syRegister(){

        return "sy/register";
    }

    @PostMapping("/register")
    public String syRegisterPost(){

        return "redirect:/sy/list";
    }

    @GetMapping("/list")
    public String syList(){

        return "sy/list";
    }
}
