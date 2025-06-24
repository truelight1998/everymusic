package com.github.everymusic.model.service.musicboard;

import com.github.everymusic.model.dto.MusicBoardDto;

import java.util.List;

public interface MusicBoardService {

    // 음악 게시판 전체 조회
    List<MusicBoardDto> getAllMusicBoard();

}
