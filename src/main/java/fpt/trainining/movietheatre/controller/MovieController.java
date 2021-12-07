package fpt.trainining.movietheatre.controller;

import fpt.trainining.movietheatre.dto.request.MovieRequest;
import fpt.trainining.movietheatre.dto.response.MovieResponse;
import fpt.trainining.movietheatre.service.MovieService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/movie")
@AllArgsConstructor
public class MovieController {
    private final MovieService service;

    @GetMapping("/get")
    public ResponseEntity<List<MovieResponse>> getAll() {
        return service.getAll();
    }

    @PostMapping("/create")
    public ResponseEntity<MovieResponse> create(@RequestBody @Valid MovieRequest request) {
        return service.create(request);
    }
}
