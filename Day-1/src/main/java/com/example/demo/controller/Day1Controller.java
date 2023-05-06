package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Day1Controller {
	@GetMapping("/welcome")
	public String Welcome()
	{
		return "Welcome String Boot!";
	}
	@GetMapping("/{name}")
	public String getName(@PathVariable String name)
	{
		return "Welcome "+name+" !";
	}
	@GetMapping("/color/{name}")
	public String getColor(@PathVariable String name)
	{
		return "My favourite color is "+name+" !";
	}

}
