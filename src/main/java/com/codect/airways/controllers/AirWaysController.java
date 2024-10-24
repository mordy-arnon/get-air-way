package com.codect.airways.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.codect.airways.data.Location;
import com.codect.airways.data.PlaneSize;
import com.codect.airways.data.Route;

@RestController
public class AirWaysController {

	@GetMapping("/route")
	public Route getAirWays(@RequestBody Location start,@RequestBody Location target, @RequestBody PlaneSize size) {
		// verify user
		// validate parameters.
		Route ret=buildRoute(start,target);
		// check the route.
		// log
		return ret;
	}

	private Route buildRoute(Location start, Location target) {
		List<Route> allRoutes=loadAllRoutesAtThisTime(start.getTime());
		return null;
	}

	private List<Route> loadAllRoutesAtThisTime(long time) {
		return null;
	}
}
