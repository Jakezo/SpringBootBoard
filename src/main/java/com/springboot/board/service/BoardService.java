package com.springboot.board.service;

import com.springboot.board.domain.entity.Board;
import com.springboot.board.domain.repository.BoardRepository;
import com.springboot.board.dto.BoardDto;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class BoardService {
    private BoardRepository boardRepository;

    public BoardService(BoardRepository boardRepository){
        this.boardRepository = boardRepository;

    }
    @Transactional
    public Long savePost(BoardDto boardDto){
        return boardRepository.save(boardDto.toEntity()).getId();
    }

}
