package com.example.demo.service;

import com.example.demo.dto.EuDTO;
import com.example.demo.entity.Eu;
import com.example.demo.repository.BrRepository;
import com.example.demo.repository.EuRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Log4j2
@Transactional
public class EuService {

    private final EuRepository euRepository;

    public void register(EuDTO euDTO) {

        Eu eu = new Eu();
        eu.setTitle(euDTO.getTitle());
        eu.setContent(euDTO.getContent());
        eu.setWriter(euDTO.getWriter());

        euRepository.save(eu);
    }


}
