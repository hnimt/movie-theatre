package fpt.trainining.movietheatre.service.impl;

import fpt.trainining.movietheatre.dto.request.MovieRequest;
import fpt.trainining.movietheatre.dto.response.MovieResponse;
import fpt.trainining.movietheatre.entity.Movie;
import fpt.trainining.movietheatre.repository.MovieRepository;
import fpt.trainining.movietheatre.service.MovieService;
import fpt.trainining.movietheatre.service.mapper.MovieMapper;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class MovieServiceImpl implements MovieService {
    private final MovieMapper mapper;
    private final MovieRepository repository;

    @Override
    public ResponseEntity<List<MovieResponse>> getAll() {
        List<Movie> movies = repository.findAll();

        List<MovieResponse> responses = movies.stream()
                .map(mapper::map)
                .collect(Collectors.toList());

        return ResponseEntity.ok(responses);
    }

    @Override
    public ResponseEntity<MovieResponse> create(MovieRequest request) {
        Movie movie = mapper.map(request);

        repository.save(movie);

        return ResponseEntity.ok(mapper.map(movie));
    }
}
