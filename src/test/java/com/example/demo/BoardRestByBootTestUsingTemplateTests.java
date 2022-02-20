package com.example.demo;

import com.example.demo.DemoApplication;
import com.example.demo.entity.BoardEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.ActiveProfiles;

//

@SpringBootTest(classes = DemoApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
class BoardRestByBootTestUsingTemplateTests {

	@Autowired
	private TestRestTemplate testRestTemplate;

	@Test
	public void findBoardInAnnotationTest() throws Exception{
		BoardEntity boardEntity = testRestTemplate.getForObject("/board/2", BoardEntity.class);
		System.out.println(boardEntity.toString());
	}

	@Test
	public void findBoardInXmlTest() throws Exception{
		BoardEntity boardEntity = testRestTemplate.getForObject("/board2/3", BoardEntity.class);
		System.out.println(boardEntity.toString());
	}


}
