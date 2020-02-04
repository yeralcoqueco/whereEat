package com.dana.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("prueba/")
public class PruebaController {
	
	@GetMapping("prueba1")
	public List<?> prueba1(){
		return Arrays.asList(1234);
	}
	
	

}
