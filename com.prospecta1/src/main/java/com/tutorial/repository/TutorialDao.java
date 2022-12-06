package com.tutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tutorial.model.Tutorial;

@Repository
public interface TutorialDao extends JpaRepository<Tutorial, Integer> {
	
	public Tutorial findById(int id);

}
