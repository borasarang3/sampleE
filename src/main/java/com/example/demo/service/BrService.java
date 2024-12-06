package com.example.demo.service;

import com.example.demo.dto.BrDTO;
import com.example.demo.entity.Br;
import com.example.demo.repository.BrRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

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

    public List<BrDTO> list() {

        List<Br> brList = brRepository.findAll();

        List<BrDTO> brDTOList = new ArrayList<>();

        for (Br br : brList) {
            BrDTO brDTO = new BrDTO();
            brDTO.setBno(br.getBno());
            brDTO.setTitle(br.getTitle());
            brDTO.setContent(br.getContent());
            brDTO.setWriter(br.getWriter());

            brDTOList.add(brDTO);
        }

        return brDTOList;

    }

}
