package com.github.everymusic.controller;

import com.github.everymusic.model.dto.MusicBoardDto;
import com.github.everymusic.model.service.musicboard.MusicBoardService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/musicboard")
public class MusicBoardController {

    private final MusicBoardService musicBoardService;

    MusicBoardController(MusicBoardService musicBoardService) {
        this.musicBoardService = musicBoardService;
    }

    // 음악 리스트 전체 조회
    @GetMapping("")
    public ResponseEntity<?> getAllMusicBoard() {
        List<MusicBoardDto> musicBoardDtoList = musicBoardService.getAllMusicBoard();

        return ResponseEntity.ok(musicBoardDtoList);
    }


}
