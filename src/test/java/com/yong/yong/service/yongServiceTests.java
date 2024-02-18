package com.yong.yong.service;

import com.yong.yong.domain.Fiveguyz;
import com.yong.yong.dto.FiveguyzDTO;
import com.yong.yong.repository.YongRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class yongServiceTests {

    @Autowired
    private FiveguyzService fiveguyzService;

    @Test
    public void registerTest(){

        FiveguyzDTO fiveguyzDTO = FiveguyzDTO.builder()
                .title("yong success....")
                .content("yong content...")
                .build();

        Long post_id = fiveguyzService.register(fiveguyzDTO);
    }
    @Test
    public void modifyTest(){

        FiveguyzDTO fiveguyzDTO = FiveguyzDTO.builder()
                .post_id(100L)
                .title("fix title......")
                .content("fix content.......")
                .build();

        fiveguyzService.modify(fiveguyzDTO);
    }
    @Test
    public void deleteTest(){

        Long post_id = 103L;

        fiveguyzService.delete(post_id);

    }
}
