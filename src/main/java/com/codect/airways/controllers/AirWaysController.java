package com.codect.airways.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AirWaysController {

	@GetMapping("/route")
	public String getAirWays() {
		return "route:";
	}
}
