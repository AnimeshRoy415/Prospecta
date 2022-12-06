package com.tutorial.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


//@ToString
//@NoArgsConstructor
//@AllArgsConstructor
//@Data
@Entity
public class Tutorial {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer id;
	String title;
	String description;
	
	public int getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getDescription() {
		return description;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Tutorial(int id, String title, String description) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		
	}
	public Tutorial() {
		super();
	}
	@Override
	public String toString() {
		return "Tutorial [id=" + id + ", title=" + title + ", description=" + description + "]";
	}
	
	
	
	
	
	

}
