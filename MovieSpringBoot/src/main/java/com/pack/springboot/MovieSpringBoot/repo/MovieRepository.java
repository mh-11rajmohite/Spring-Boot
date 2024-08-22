package com.pack.springboot.MovieSpringBoot.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pack.springboot.MovieSpringBoot.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie,Integer>  {


	   List<Movie> findByType(String type);
}
