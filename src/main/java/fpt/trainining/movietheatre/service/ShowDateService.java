package fpt.trainining.movietheatre.service;

import fpt.trainining.movietheatre.dto.request.ShowDateRequest;
import fpt.trainining.movietheatre.dto.response.ShowDateResponse;
import org.springframework.http.ResponseEntity;

import java.time.LocalDate;
import java.util.List;

public interface ShowDateService {
    ResponseEntity<List<ShowDateResponse>> getAll();

    ResponseEntity<ShowDateResponse> getByDate(LocalDate date);

    ResponseEntity<ShowDateResponse> create(ShowDateRequest request);
}
