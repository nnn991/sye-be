package dev.music.sye.service;

import java.util.List;

import dev.music.sye.model.dto.PlayListDTO;
import dev.music.sye.model.dto.SongInfoDTO;

public interface SongInfoService {

    // 플레이리스트에 노래 추가
    void addSong(SongInfoDTO songInfoDTO);

    // 플레이리스트에서 노래 삭제
    List<SongInfoDTO> deleteSong(SongInfoDTO songInfoDTO);

    // 플레이리스트에서 노래 받아오기
    List<SongInfoDTO> showSongList(PlayListDTO playListDTO);
    
}
