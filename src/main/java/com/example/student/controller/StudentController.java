package com.example.student.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/students")
public class StudentController {
 
	 @PostMapping("/Saving")
	    public String createTest() {
	        return "POST request call successfully";
	    }
	 
	    @DeleteMapping("/Delete")
	    public String deleteTest() {
	        return 
	    }
    
}