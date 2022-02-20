package com.example.demo;

import com.example.demo.DemoApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

// @WebMvcTest 不需要运行在web环境下，但是，需要指定controllers，表示需要测试哪些controllers。
//	这种方式只测试controller，controller里面的一些依赖，需要你自己去mock
// @WebMvcTest 不会加载整个spring容器。

@SpringBootTest(classes = DemoApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
@ActiveProfiles("test")
class BoardRestByBootTestAndAutoMockMvcTests {
	@Autowired
	private MockMvc mockMvc;

	@Test
	public void findBoardInAnnotationTest() throws Exception{
		MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/board/2"))
				.andDo(MockMvcResultHandlers.print())
				.andReturn();
	}

	@Test
	public void findBoardInXmlTest() throws Exception{
		MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/board2/2"))
				.andDo(MockMvcResultHandlers.print())
				.andReturn();
	}


}
