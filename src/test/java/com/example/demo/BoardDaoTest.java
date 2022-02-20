package com.example.demo;

import com.example.demo.dao.BoardDao;
import com.example.demo.entity.BoardEntity;
import com.example.demo.service.BoardService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

// 配置成WebEnvironment.NONE，是不需要用到 Tomcat 容器时。比如：
//      测试 DAO 类的CRUD
//      测试Service 类的业务方法
//      测试工具类的公用方法
//      测试配置文件类是否读取到了正确的值

@Slf4j
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
@ActiveProfiles("test")
public class BoardDaoTest {
    @Autowired
    private BoardDao boardDao;

    @Test
    public void boardDaoTest() {
        BoardEntity boardDaoEntity = boardDao.findById(2);
        System.out.println("This is Test boardDao...");
        System.out.println(boardDaoEntity.toString());
    }

}
