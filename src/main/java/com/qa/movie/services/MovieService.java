package com.qa.movie.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.qa.movie.persistence.domain.Movie;
import com.qa.movie.persistence.repo.MovieRepo;

@Service
public class MovieService {
	private MovieRepo repo;

	public MovieService(MovieRepo repo) {
		super();
		this.repo = repo;
	}

	public List<Movie> getAllMovies() {
		return this.repo.findAll();
	}

	public Movie updateMovie(long id, Movie movie) {
		Movie movieToUpdate = this.repo.getOne(id);
		movieToUpdate.setTitle(movie.getTitle());
		return this.repo.save(movieToUpdate);
	}

	public void deleteMovie(long id) {
		this.repo.deleteById(id);
	}

	public Movie createMovie(Movie movie) {
		return this.repo.save(movie);
	}
}
