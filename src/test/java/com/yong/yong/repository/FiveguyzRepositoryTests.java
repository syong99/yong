package com.yong.yong.repository;

import com.yong.yong.domain.Fiveguyz;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.IntStream;

@SpringBootTest
public class FiveguyzRepositoryTests {

    @Autowired
    private YongRepository yongRepository;

    @Test
    public void testInsert() {
        IntStream.rangeClosed(1, 100).forEach(i -> {
            Fiveguyz fiveguyz = Fiveguyz.builder()
                    .title("title......" + i)
                    .content("content......" + i)
                    .build();
            yongRepository.save(fiveguyz);
        });
    }
}