package com.vladislavskiy.TaskProject;


import com.vladislavskiy.TaskProject.controller.Controller;
import com.vladislavskiy.TaskProject.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.is;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class TaskProjectApplicationTests {
	@Autowired
	private Controller controller;

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private UserRepository repository;
	@Test
	public void test() throws Exception{
		assertThat(controller).isNotNull();
	}
	@Test
	public void test2() throws Exception{
		mockMvc.perform(get("/api/user/3").contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk());
	}
	@Test
	public void test3() throws Exception{
		mockMvc.perform(get("/api/user/224").contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isNotFound());
	}


}
