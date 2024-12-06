package com.example.demo.controller;

import com.example.demo.dto.EuDTO;
import com.example.demo.service.EuService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log4j2
@RequiredArgsConstructor
@RequestMapping("/eu")
public class EuController {

    private final EuService euService;

    @GetMapping("/list")
    public String euList() {

        return "eu/list";
    }

    @GetMapping("/register")
    public String euRegister(){

        return "eu/register";
    }

    @PostMapping("/register")
    public String euRegisterPost(EuDTO euDTO){
        euService.register(euDTO);

        return "eu/list";
    }


    }
