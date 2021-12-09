package fpt.trainining.movietheatre.service.impl;

import fpt.trainining.movietheatre.dto.movie.MovieRequest;
import fpt.trainining.movietheatre.dto.movie.MovieResponse;
import fpt.trainining.movietheatre.entity.Movie;
import fpt.trainining.movietheatre.exception.ResourceNotFoundException;
import fpt.trainining.movietheatre.repository.MovieRepository;
import fpt.trainining.movietheatre.service.MovieService;
import fpt.trainining.movietheatre.service.mapper.MovieMapper;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class MovieServiceImpl implements MovieService {
    private final MovieMapper mapper;
    private final ModelMapper modelMapper;
    private final MovieRepository repository;

    public List<Movie> findAll() {
        return repository.findAll();
    }

    @Override
    public Movie findById(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Cannot find movie with id = " + id));
    }

    @Override
    public ResponseEntity<List<MovieResponse>> getAll() {
        List<MovieResponse> responses = findAll().stream()
                .map(mapper::map)
                .collect(Collectors.toList());

        return ResponseEntity.ok(responses);
    }

    @Override
    public ResponseEntity<MovieResponse> getById(String id) {
        Movie movie = findById(id);

        return ResponseEntity.ok(mapper.map(movie));
    }

    @Override
    public ResponseEntity<MovieResponse> create(MovieRequest request) {
        Movie movie = mapper.map(request);

        repository.save(movie);

        return ResponseEntity.ok(mapper.map(movie));
    }

    @Override
    public ResponseEntity<MovieResponse> update(String id, MovieRequest request) {
        Movie movie = findById(id);
        mapper.map(request, movie);
        repository.save(movie);

        return ResponseEntity.ok(mapper.map(movie));
    }

    @Override
    public void remove(String movieId) {
        repository.deleteById(movieId);
    }
}
