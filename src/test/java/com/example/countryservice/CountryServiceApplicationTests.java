package com.example.countryservice;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CountryServiceApplicationTests {

	@Autowired
	private WebApplicationContext webApplicationContext;

	@Before
	public void setup() {
		RestAssuredMockMvc.webAppContextSetup(webApplicationContext);
	}
	
	@Test
	public void contextLoads() {
	}

}
