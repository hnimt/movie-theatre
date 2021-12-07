package fpt.trainining.movietheatre.controller;

import fpt.trainining.movietheatre.dto.request.ShowDateRequest;
import fpt.trainining.movietheatre.dto.response.ShowDateResponse;
import fpt.trainining.movietheatre.service.ShowDateService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/show-date")
@AllArgsConstructor
public class ShowDateController {
    private final ShowDateService service;

    @GetMapping("/get")
    public ResponseEntity<List<ShowDateResponse>> getAll() {
        return service.getAll();
    }

    @PostMapping("/create")
    public ResponseEntity<ShowDateResponse> create(@RequestBody @Valid ShowDateRequest request) {
        return service.create(request);
    }

}
