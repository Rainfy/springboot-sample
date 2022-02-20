package com.example.demo.service;

import com.example.demo.controller.BoardController;
import com.example.demo.entity.BoardEntity;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

// @WebMvcTest 不需要运行在web环境下，但是，需要指定controllers，表示需要测试哪些controllers。
//	这种方式只测试controller，controller里面的一些依赖，需要你自己去mock
// @WebMvcTest 不会加载整个spring容器。

@Disabled
@WebMvcTest(controllers = BoardController.class)
@ActiveProfiles("test")
class BoardCtrlByWebMvcUsingMockBeanTests {
	@Autowired
	private MockMvc mockMvc;

	@MockBean
	public BoardService boardService;

	@Test
	public void findBoardInAnnotationTest() throws Exception{
		Mockito.when(boardService.findBoardInAnnotation(Mockito.anyInt())).thenReturn(new BoardEntity("2", "mockcomment2"));
		MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/board/2"))
				.andDo(MockMvcResultHandlers.print())
				.andReturn();
	}

}
