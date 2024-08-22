package com.pack.springboot.MovieSpringBoot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pack.springboot.MovieSpringBoot.entity.Movie;
import com.pack.springboot.MovieSpringBoot.repo.MovieRepository;

@Service
public class MovieService {

	@Autowired
	MovieRepository movieRepo;
	
	public Movie createMovie(Movie movie) {
 
			
		return movieRepo.save(new Movie(movie.getId(),movie.getName(),movie.getLanguage(),movie.getType(),movie.getRating()));
	}

	public List<Movie> getAllMoives() {
		// TODO Auto-generated method stub
		return movieRepo.findAll();
	}

	public Movie getMovieById(Integer id) {
 
		return movieRepo.findById(id).get();
	}

	public List<Movie> getMovieByType(String type) {
		// TODO Auto-generated method stub
		return movieRepo.findByType(type);
	}

	
}
