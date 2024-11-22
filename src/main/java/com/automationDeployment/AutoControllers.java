package com.automationDeployment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class AutoControllers {
	
	@GetMapping(path = "/getDataAuo")
	
	public String getData() {
		return "santhosh";
	}

}
