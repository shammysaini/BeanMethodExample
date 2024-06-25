package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.config.Calculation;

@RestController
public class ExecutionController {
	
private Calculation calculation;

	
ExecutionController(Calculation calculation) {
		this.calculation = calculation;

	}

	@GetMapping("/add")
	public void calling()
	{
		calculation.add(10,10);
		calculation.subtract(20, 10);
		
	}

}
