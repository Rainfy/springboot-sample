package com.example.demo.controller;

import com.example.demo.entity.BoardEntity;
import com.example.demo.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BoardController {

    @Autowired
    private BoardService boardService;

    /**
     * http://localhost:8888/board/2
     * Header
     *   Content-Type: application/json
     */
    @GetMapping(value = "/board/{id}")
    public @ResponseBody
    BoardEntity findBoardInAnnotation(@PathVariable("id") int id) {
        return boardService.findBoardInAnnotation(id);
    }

    @GetMapping(value = "/board2/{id}")
    public @ResponseBody
    BoardEntity findBoardOfXML(@PathVariable("id") int id) {
        return boardService.findBoardInXMl(id);
    }
}
