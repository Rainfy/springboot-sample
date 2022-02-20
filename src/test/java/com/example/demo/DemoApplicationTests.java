package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

// 会去按顺序找 @SpringBootConfiguration，如果发现了多个,就会报错

// 带了classes的配置，只会加载这个配置的类， 就不会去找@SpringBootConfiguration的类
//   但带了@SpringBootConfiguration的相应的类会加载，作为普通的Bean会加载进来
//   假如恰好classes对应的就是带了@SpringBootConfiguration的相应的类，则会把相应的配置的类都加载起来了。

// webEnvironment参数指定了web的environment，该参数的值一共有四个可选值：
//		MOCK：此值为默认值，该类型提供一个mock环境，可以和@AutoConfigureMockMvc或@AutoConfigureWebTestClient搭配使用，开启Mock相关的功能。
//			注意此时内嵌的服务（servlet容器）并没有真正启动，也不会监听web服务端口。
//		RANDOM_PORT：启动一个真实的web服务，监听一个随机端口。
//		DEFINED_PORT：启动一个真实的web服务，监听一个定义好的端口（从application(xx).yml读取）。
//		NONE：启动一个非web的ApplicationContext，既不提供mock环境，也不提供真实的web服务

// ActiveProfiles如果没有配置，就使用application.配置

//@SpringBootTest
@SpringBootTest(classes = DemoApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
class DemoApplicationTests {

	@Test
	void contextLoads() {

	}

}
