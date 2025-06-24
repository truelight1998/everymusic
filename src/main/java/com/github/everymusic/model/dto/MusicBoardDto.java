package com.github.everymusic.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MusicBoardDto {
    private int id;
    private String title;
    private String singer;
    private String writer;
    private LocalDateTime createdAt;
    private int viewCnt;
    private int likeCnt;
}
