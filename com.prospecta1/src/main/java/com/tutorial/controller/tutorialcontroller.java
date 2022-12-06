package com.tutorial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tutorial.model.Tutorial;
import com.tutorial.service.TutorialService;



@RestController
@RequestMapping("/tutorials")
public class tutorialcontroller {

	@Autowired
	private TutorialService tService;
	
	
	@PostMapping("/")
	public Tutorial saveTutorialHandler(@RequestBody Tutorial tutorial) {
		
		return tService.addTutorial(tutorial);
		
	}
	
	@GetMapping("/tutorials")
	public List<Tutorial> getAllTutorials(){
		return tService.getAllTutorials();
	}
	
}
