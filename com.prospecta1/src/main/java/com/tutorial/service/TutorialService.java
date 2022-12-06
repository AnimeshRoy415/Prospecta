package com.tutorial.service;

import java.util.List;

import com.tutorial.model.Tutorial;

public interface TutorialService {
	
	
	public Tutorial addTutorial(Tutorial tutorial);
	public List<Tutorial> getAllTutorials();
	

}
