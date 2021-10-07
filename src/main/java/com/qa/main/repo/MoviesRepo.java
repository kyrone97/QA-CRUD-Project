package com.qa.main.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qa.main.domain.Movies;


public interface MoviesRepo extends JpaRepository<Movies, Long>{

}
