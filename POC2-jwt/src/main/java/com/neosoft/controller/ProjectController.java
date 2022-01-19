package com.neosoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.dao.ProjectRepository;

import com.neosoft.model.Projectjwt;


@RestController
public class ProjectController {
	
	@Autowired
	 ProjectRepository projectRepository;
	
	
	
	@PostMapping("/addProjecttt")
	public ResponseEntity<?> addPro(@RequestBody Projectjwt project) {
		projectRepository.save(project);
		return new ResponseEntity<>("Inserted successfully", HttpStatus.OK);
	}

	@GetMapping("/getAllProjectsss")
	public List<Projectjwt> getAllProject() {
		return projectRepository.findAll();
		
	}
}
