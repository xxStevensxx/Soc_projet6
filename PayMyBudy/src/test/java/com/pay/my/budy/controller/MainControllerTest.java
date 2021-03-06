package com.pay.my.budy.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class MainControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	

	@Test
	public void homeControllerTest() throws Exception {
		
		//WHEN
		
		
		//GIVEN
		
		
		//THEN
		mockMvc.perform(get("/home")).andExpect(status().isOk());
				
		
		
	}
	
	
	@Test
	public void loginControllerTest() throws Exception {
		
		//WHEN
		
		
		//GIVEN
		
		
		//THEN
		mockMvc.perform(get("/login")).andExpect(status().isOk());
				
		
		
	}
	
	@Test
	public void submitFormLoginTest() throws Exception {
		
		//WHEN
		
		
		//GIVEN
		
		
		//THEN
		mockMvc.perform(get("/login")).andExpect(status().isOk());
				
		
		
	}
	
	@Test
	public void contactControllerTest() throws Exception {
		
		//WHEN
		
		
		//GIVEN
		
		
		//THEN
		mockMvc.perform(get("/contact")).andExpect(status().isOk());
				
		
		
	}
	
	@Test
	public void transfertControllerTest() throws Exception {
		
		//WHEN
		
		
		//GIVEN
		
		
		//THEN
		mockMvc.perform(get("/transfert")).andExpect(status().isOk());
				
		
		
	}

}
