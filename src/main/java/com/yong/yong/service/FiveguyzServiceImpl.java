package com.yong.yong.service;

import com.yong.yong.domain.Fiveguyz;
import com.yong.yong.dto.FiveguyzDTO;
import com.yong.yong.repository.YongRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class FiveguyzServiceImpl implements FiveguyzService{

    private final YongRepository yongRepository;

    @Override
    public Long register(FiveguyzDTO fiveguyzDTO) {
        Fiveguyz fiveguyz = new Fiveguyz();

        fiveguyz.setTitle(fiveguyzDTO.getTitle());
        fiveguyz.setContent(fiveguyzDTO.getContent());

        Long post_id = yongRepository.save(fiveguyz).getPost_id();

        return post_id;
    }

    @Override
    public void modify(FiveguyzDTO fiveguyzDTO) {

        Optional<Fiveguyz> result = yongRepository.findById(fiveguyzDTO.getPost_id());

        Fiveguyz fiveguyz = result.orElseThrow(() -> new IllegalArgumentException("해당 ID의 게시글이 존재하지 않습니다."));

        fiveguyz.setTitle(fiveguyzDTO.getTitle());
        fiveguyz.setContent(fiveguyzDTO.getContent());

        yongRepository.save(fiveguyz);
    }

    @Override
    public void delete(Long post_id) {

        yongRepository.deleteById(post_id);
    }
}
