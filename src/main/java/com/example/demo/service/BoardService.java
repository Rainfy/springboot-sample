package com.example.demo.service;

import com.example.demo.entity.BoardEntity;

public interface BoardService {
    public BoardEntity findBoardInAnnotation(int id);

    public BoardEntity findBoardInXMl(int id);
}
