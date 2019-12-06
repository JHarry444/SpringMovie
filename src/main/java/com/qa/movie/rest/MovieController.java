package com.qa.movie.rest;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.movie.persistence.domain.Movie;
import com.qa.movie.services.MovieService;

@RestController
@RequestMapping("/movie")
public class MovieController {

	private MovieService service;

	public MovieController(MovieService service) {
		super();
		this.service = service;
	}

	@GetMapping("/getAll")
	public List<Movie> getAllMovies() {
		return this.service.getAllMovies();
	}

	@PutMapping("/update/{id}")
	public Movie updateMovie(@PathVariable long id, @RequestBody Movie movie) {
		return this.service.updateMovie(id, movie);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteMovie(@PathVariable long id) {
		this.service.deleteMovie(id);
	}

	@PostMapping("/create")
	public Movie createMovie(@RequestBody Movie movie) {
		return this.service.createMovie(movie);
	}
}
