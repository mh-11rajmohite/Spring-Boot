package com.pack.springboot.MovieSpringBoot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pack.springboot.MovieSpringBoot.entity.Movie;
import com.pack.springboot.MovieSpringBoot.service.MovieService;

@RestController
@RequestMapping("/api")
public class MovieController {

	@Autowired
	MovieService movieService;
	
	@PostMapping("/movie")
	public ResponseEntity<Movie> createMovie(@RequestBody Movie movie){
		
		try {
			Movie savedMovie = movieService.createMovie(movie);
			return new ResponseEntity<Movie>(savedMovie,HttpStatus.CREATED);

		
		}
		catch(Exception e) {}
			return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@GetMapping("/movie")
	public ResponseEntity<List> getAllMovies(){
		
		try {
			
			List<Movie> list = new ArrayList<>();
			movieService.getAllMoives().forEach(list::add);
			
			if(list.isEmpty()) {
				
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(list,HttpStatus.CREATED);
		}		
		catch(Exception e) {
			
			return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
			
		}
		
	}
	
	
	 
	
	@GetMapping("/movie/{movieId}")
	public ResponseEntity<Movie> getMovieById(@PathVariable("movieId") Integer id){
		
		Movie movie = movieService.getMovieById(id);
		
		if(movie!=null) {
			
			return new ResponseEntity<Movie>(movie,HttpStatus.OK);
			
		}
		else {
			
			return new ResponseEntity<Movie>(HttpStatus.NOT_FOUND);
			
		}
		
	}
	
	
	
	@GetMapping("/movie/byType")
	public ResponseEntity<List<Movie>> getMovieByType(@RequestParam("type") String type){
		
		List<Movie> list = movieService.getMovieByType(type);
		
		
		if(list.isEmpty()) {
			
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			
		}
		else {
			
			return new ResponseEntity<>(list,HttpStatus.OK);
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
