package com.example.demo.dao;

import com.example.demo.entity.BoardEntity;

public interface BoardDao {
    BoardEntity findById(int id);
}
