package com.github.everymusic.model.service.musicboard;

import com.github.everymusic.model.dto.MusicBoardDto;
import com.github.everymusic.model.mapper.MusicBoardMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicBoardServiceImpl implements MusicBoardService {

    private final MusicBoardMapper musicBoardMapper;

    MusicBoardServiceImpl(MusicBoardMapper musicBoardMapper) {
        this.musicBoardMapper = musicBoardMapper;
    }

    @Override
    public List<MusicBoardDto> getAllMusicBoard() {
        return musicBoardMapper.selectAllMusicBoard();
    }
}
