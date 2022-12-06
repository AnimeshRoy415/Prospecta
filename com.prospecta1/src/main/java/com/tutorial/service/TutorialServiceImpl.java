package com.tutorial.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutorial.controller.tutorialcontroller;
import com.tutorial.exception.TutorialNotFound;
import com.tutorial.model.Tutorial;
import com.tutorial.repository.TutorialDao;

@Service
public class TutorialServiceImpl implements TutorialService {

	
	@Autowired
	private TutorialDao tutorialDao;

	@Override
	public Tutorial addTutorial(Tutorial tutorial) {
		
		Tutorial getTutorial = tutorialDao.findById(tutorial.getId());
		
		if(getTutorial!=null) throw new TutorialNotFound("Tutorial already exist");
		else {
			
			return tutorialDao.save(tutorial);
		}
//		return null;
	}

	@Override
	public List<Tutorial> getAllTutorials() {
		List<Tutorial> list= tutorialDao.findAll();
		
		if(list.size() >0) return list;
		
		else throw new TutorialNotFound("No tutorial present");
	}

	
	
	
	
}
