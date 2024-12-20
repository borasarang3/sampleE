package com.example.demo.controller;

import com.example.demo.dto.BrDTO;
import com.example.demo.service.BrService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@Log4j2
@RequiredArgsConstructor
@RequestMapping("/br")
public class BrController {

    private final BrService brService;

    @GetMapping("/list")
    public String brList (Model model) {

        List<BrDTO> brDTOList = brService.list();

        model.addAttribute("brDTOList", brDTOList);

        return "br/list";
    }

    @GetMapping("/register")
    public String brRegister() {
        return "br/register";
    }

    @PostMapping("/register")
    public String brRegisterPost(BrDTO brDTO) {
        brService.register(brDTO);

        return "redirect:/br/list";
    }

}
