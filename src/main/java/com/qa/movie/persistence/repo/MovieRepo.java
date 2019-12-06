package com.qa.movie.persistence.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.movie.persistence.domain.Movie;

@Repository
public interface MovieRepo extends JpaRepository<Movie, Long> {

}
