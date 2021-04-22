package com.triangle.Triangle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.triangle.Triangle.service.TriangleService;

@RestController
public class TriangleController {
	
	@Autowired
	private TriangleService service;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/getType")
	public String getType(@RequestParam(value = "sizes") List<String> sizes) {
		return service.getType(sizes);
	}

}
