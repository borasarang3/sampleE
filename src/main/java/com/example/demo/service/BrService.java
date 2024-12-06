package com.example.demo.service;

import com.example.demo.dto.BrDTO;
import com.example.demo.entity.Br;
import com.example.demo.repository.BrRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Log4j2
@Transactional
public class BrService {

    private final BrRepository brRepository;

    public void register(BrDTO brDTO) {

        Br br = new Br();
        br.setTitle(brDTO.getTitle());
        br.setContent(brDTO.getContent());
        br.setWriter(brDTO.getWriter());

        brRepository.save(br);

    }

}
