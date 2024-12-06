package com.example.demo.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;

@Controller
@Log4j2
public class YrController {
    public String list(){


        log.info("처음 수정했어요");


        return "yr/list";
    }

}
