package com.qa.main.domain;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Movies {
	
	@Id
	@GeneratedValue
	private Long id;
	private String movieTitle;
	private String ageRating;
	private String genre;
	private String runtime;
	private String releaseYear;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMovieTitle() {
		return movieTitle;
	}
	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}
	public String getAgeRating() {
		return ageRating;
	}
	public void setAgeRating(String ageRating) {
		this.ageRating = ageRating;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getRuntime() {
		return runtime;
	}
	public void setRuntime(String runtime) {
		this.runtime = runtime;
	}
	public String getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(String releaseYear) {
		this.releaseYear = releaseYear;
	}
	@Override
	public String toString() {
		return "Movies [id=" + id + ", movieTitle=" + movieTitle + ", ageRating=" + ageRating + ", genre=" + genre
				+ ", runtime=" + runtime + ", releaseYear=" + releaseYear + "]";
	}
	public Movies(Long id, String movieTitle, String ageRating, String genre, String runtime, String releaseYear) {
		super();
		this.id = id;
		this.movieTitle = movieTitle;
		this.ageRating = ageRating;
		this.genre = genre;
		this.runtime = runtime;
		this.releaseYear = releaseYear;
	}
	
	
	public Movies() {
		super();
	}
	
	
	public Movies(String movieTitle, String ageRating, String genre, String runtime, String releaseYear) {
		super();
		this.movieTitle = movieTitle;
		this.ageRating = ageRating;
		this.genre = genre;
		this.runtime = runtime;
		this.releaseYear = releaseYear;
	}
	@Override
	public int hashCode() {
		return Objects.hash(ageRating, genre, id, movieTitle, releaseYear, runtime);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movies other = (Movies) obj;
		return Objects.equals(ageRating, other.ageRating) && Objects.equals(genre, other.genre)
				&& Objects.equals(id, other.id) && Objects.equals(movieTitle, other.movieTitle)
				&& Objects.equals(releaseYear, other.releaseYear) && Objects.equals(runtime, other.runtime);
	}
	
	
	
	
	
	
	

}
