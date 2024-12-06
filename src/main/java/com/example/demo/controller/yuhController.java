package com.example.demo.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
@Log4j2
public class yuhController {

    @GetMapping("/yuh/list")
    public String lotus(){

        return "yuh/list";
    }

    @GetMapping("/yuh/read")
    public String read(){

        return "yuh/read";
    }



}
