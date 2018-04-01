package com.zyw.moonII;

import com.zyw.moonII.controller.HomeController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MoonIiApplicationTests {

	private MockMvc mvc;

	@Before
	public void setUp(){
		mvc = MockMvcBuilders.standaloneSetup(new HomeController()).build();
	}

	@Test
	public void contextLoads() {
		try {
			mvc.perform(MockMvcRequestBuilders.post("/home/hello").accept(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk()).andExpect(content().string("Hello World"));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
