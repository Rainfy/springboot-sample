package com.example.demo.dao;

import com.example.demo.entity.BoardEntity;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface AnnotationBoardDao {

    @Select("SELECT * FROM BOARD WHERE ID = #{id}")
    BoardEntity findById(@Param("id") int id);
}
