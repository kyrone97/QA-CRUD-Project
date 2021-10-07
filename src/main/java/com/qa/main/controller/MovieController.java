package com.qa.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.main.domain.Movies;
import com.qa.main.service.MoviesService;

@RequestMapping("/movies")
//localhost:9000/movies >> /delete >> /create
@RestController
public class MovieController {
	
	@Autowired
	private MoviesService service;
	
	
	//create
	@PostMapping("/create")
	public ResponseEntity<Movies> create(@RequestBody Movies p) {
		return new ResponseEntity<Movies>(this.service.create(p), HttpStatus.CREATED);
	}

//read
	@GetMapping("/read")
	public ResponseEntity<List<Movies>> readAll(){
		return new ResponseEntity<List<Movies>>(this.service.readAll(),HttpStatus.OK);	
	}
	
//read id
	@GetMapping("/read/{id}")
	public ResponseEntity<Movies> read(@PathVariable Long id){
		return new ResponseEntity<Movies>(this.service.read(id),HttpStatus.OK);	
	}
	
//update
	@PutMapping("/update/{id}")
	public ResponseEntity<Movies> update(@PathVariable Long id, @RequestBody Movies p){
		return new ResponseEntity<Movies>(this.service.update(p, id), HttpStatus.ACCEPTED);
		
	}
	
//delete
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Boolean>delete(@PathVariable Long id){
		return new ResponseEntity<Boolean>(this.service.delete(id), HttpStatus.NO_CONTENT);
	}
//Find by name
	@GetMapping("/readname/{name}")
	public ResponseEntity<List<Movies>> findByName(@PathVariable String name) {
		return new ResponseEntity<List<Movies>>(this.service.findByName(name), HttpStatus.OK);
		
	}
	


	

}
