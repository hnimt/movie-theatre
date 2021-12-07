package fpt.trainining.movietheatre.service;

import fpt.trainining.movietheatre.dto.request.ShowDateRequest;
import fpt.trainining.movietheatre.dto.response.ShowDateResponse;
import fpt.trainining.movietheatre.entity.ShowDate;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ShowDateService {
    ResponseEntity<List<ShowDateResponse>> getAll();
    ResponseEntity<ShowDateResponse> create(ShowDateRequest request);
}
