package com.alexandra.routingproject;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	@RequestMapping("/{location}")
	public String showLesson (@PathVariable("location") String searchQuery){
	if (searchQuery.equals("dojo")) {
		return "the dojo is awwwsuummmmm!";
	}
	else if (searchQuery.equals("burbank-dojo")) {
		return "Burbank dojo is in Southern California";	
	}
	else if (searchQuery.equals("sanjose-dojo")) {
		return "San Jose dojo is in Northern California";	
	}
	return "nothing";
	
}
}
