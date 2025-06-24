package com.github.everymusic.model.mapper;

import com.github.everymusic.model.dto.MusicBoardDto;

import java.util.List;

public interface MusicBoardMapper {

    // 음악 게시판 전체 조회
    List<MusicBoardDto> selectAllMusicBoard();
}
