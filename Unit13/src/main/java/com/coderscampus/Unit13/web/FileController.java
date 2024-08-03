package com.coderscampus.Unit13.web;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.Unit13.domain.User;
import com.coderscampus.Unit13.service.FileService;

@RestController
public class FileController {
	
	@Autowired
	private FileService fileService;
	
	@Autowired
	private User user;
	
	@GetMapping("/read-lines")
	public List<String> readLines () throws IOException{
		System.out.println(user);
		return fileService.readFile();
	}
	
	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World!";
	}
	
	@PostMapping("/hello-world")
	public String helloWorldPost() {
		return "Ok, cool, you just posted data!";
	}
}
