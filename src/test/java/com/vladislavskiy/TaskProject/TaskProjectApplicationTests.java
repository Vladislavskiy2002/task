package com.vladislavskiy.TaskProject;

import com.vladislavskiy.TaskProject.controller.Controller;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
class TaskProjectApplicationTests {
	@Autowired
	private Controller controller;
	@Test
	void test() throws Exception{
		assertThat(controller).isNotNull();
	}
//	@Test
//	public void givenEmployees_whenGetEmployees_thenStatus200() throws Exception {
//		createTestEmployee("bob");
//		mvc.perform(get("/api/employees")
//						.contentType(MediaType.APPLICATION_JSON))
//				.andExpect(status().isOk())
//				.andExpect(content()
//						.contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
//				.andExpect(jsonPath("$[0].name", is("bob")));
//	}

}
