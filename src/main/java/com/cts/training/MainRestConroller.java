package com.cts.training;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestConroller {

	@GetMapping("/test")
	public String sayWoohoo() {
		return "Woohooo! You have reached me.  ;)";
	}
	
	@GetMapping("/list")
	public List<String> listLanguages() {
		return Arrays.asList("Java", "Python", "C", "Ruby");
	}
}
