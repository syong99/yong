package com.yong.yong.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FiveguyzDTO {

    private Long post_id;

    private String title;

    private String content;

}
