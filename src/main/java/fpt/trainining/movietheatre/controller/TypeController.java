package fpt.trainining.movietheatre.controller;

import fpt.trainining.movietheatre.dto.request.TypeRequest;
import fpt.trainining.movietheatre.dto.response.TypeResponse;
import fpt.trainining.movietheatre.service.TypeService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/types")
@AllArgsConstructor
public class TypeController {
    private final TypeService service;

    @GetMapping("/get")
    public ResponseEntity<List<TypeResponse>> getAll() {
        return service.getAll();
    }

    @PostMapping("/create")
    public ResponseEntity<TypeResponse> create(@RequestBody @Valid TypeRequest request) {
        return service.create(request);
    }
}
