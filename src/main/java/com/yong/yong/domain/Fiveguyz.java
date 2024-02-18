package com.yong.yong.domain;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Length;

@Builder
@Data
@Entity(name = "fiveguyz")
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Fiveguyz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long post_id;

    @Column(length = 50, nullable = false)
    private String title;

    @Column(length = 300, nullable = false)
    private String content;

}
