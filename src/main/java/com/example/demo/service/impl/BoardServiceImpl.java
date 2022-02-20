package com.example.demo.service.impl;

import com.example.demo.dao.BoardDao;
import com.example.demo.entity.BoardEntity;
import com.example.demo.service.BoardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    private BoardDao boardDao;

    @Override
    public BoardEntity findBoardInAnnotation(int id) {
        log.info("findBoardInAnnotation");
        return boardDao.findById(id);
    }

    @Override
    public BoardEntity findBoardInXMl(int id) {
        System.out.println("GOOD");
        log.debug(".findBoardInXMl");
        return boardDao.findById(id);
    }
}
