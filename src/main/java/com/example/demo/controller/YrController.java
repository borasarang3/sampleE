package com.example.demo.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Log4j2
public class YrController {
    @GetMapping("/yr/list")
    public String list(){


        log.info("처음 수정했어요");
        log.info("처음 글로벌유저네임 변경");


        return "yr/list";
    }
    @GetMapping("/yr/register")
    public String register(){


        log.info("글쓰기");

        return "yr/register";
    }


}
