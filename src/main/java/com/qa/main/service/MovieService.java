package com.qa.main.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.qa.main.domain.Movies;
import com.qa.main.repo.MoviesRepo;

@Service
public class MovieService {
	private MoviesRepo repo;


	//create
	public Movies create(Movies p) {
		return this.repo.saveAndFlush(p);

	}

	
//read All
	public List<Movies> readAll() {
		return this.repo.findAll();

	}

//read id

	public Movies read(Long id) {
		return this.repo.getById(id);
	}

//update
	public Movies update(Movies p, Long id) {
		Movies exists = this.repo.findById(id).orElseThrow();
		exists.setMovieTitle(p.getMovieTitle());
		exists.setAgeRating(p.getAgeRating());
		exists.setGenre(p.getGenre());
		exists.setRuntime(p.getRuntime());
		exists.setReleaseYear(p.getReleaseYear());

		return this.repo.saveAndFlush(exists);
	}

//delete
	public Boolean delete(Long id) {
		if (!this.repo.existsById(id)) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "NO PERSON FOUND");
		}

		this.repo.deleteById(id);
		return !this.repo.existsById(id);
	}

//find by name
	public List<Movies> findByName(String name) {
		return this.repo.findByName(name);

	}

}
