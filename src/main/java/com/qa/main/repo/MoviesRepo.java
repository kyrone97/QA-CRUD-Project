package com.qa.main.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.qa.main.domain.Movies;


public interface MoviesRepo extends JpaRepository<Movies, Long>{
	//
	@Query(value = "SELECT * FROM Person Where first_name =?1 ", nativeQuery = true)
	List<Movies> findByName(String name);
	// ?1 is our query parameter number 

}
