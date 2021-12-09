package fpt.trainining.movietheatre.service;

import fpt.trainining.movietheatre.dto.request.MovieRequest;
import fpt.trainining.movietheatre.dto.response.MovieResponse;
import fpt.trainining.movietheatre.entity.Movie;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface MovieService {
    Movie findById(String id);
    ResponseEntity<List<MovieResponse>> getAll();
    ResponseEntity<MovieResponse> getById(String id);
    ResponseEntity<MovieResponse> create(MovieRequest request);
    ResponseEntity<MovieResponse> update(String id, MovieRequest request);
    void remove(String movieId);
}
