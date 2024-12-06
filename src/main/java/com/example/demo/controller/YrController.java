package com.example.demo.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Log4j2
public class YrController {
    @GetMapping("/yr/list")
    public String list(){


        log.info("처음 수정했어요");


        return "yr/list";
    }

}
