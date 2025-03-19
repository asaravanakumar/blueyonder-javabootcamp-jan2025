package com.labs.sboot;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootTest
@Slf4j
class SbootJunitLabsApplicationTests {

	@Autowired
	ApplicationContext ctx;

	@Test
	void contextLoads() {
		log.info("No of Beans {}", ctx.getBeanDefinitionCount());
		Arrays.stream(ctx.getBeanDefinitionNames()).forEach(log::info);
	}

}
