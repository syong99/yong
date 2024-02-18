package com.yong.yong.service;

import com.yong.yong.dto.FiveguyzDTO;

public interface FiveguyzService {

    Long register(FiveguyzDTO fiveguyzDTO);

    void modify(FiveguyzDTO fiveguyzDTO);

    void delete(Long post_id);
}
