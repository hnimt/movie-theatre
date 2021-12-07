package fpt.trainining.movietheatre.service;

import fpt.trainining.movietheatre.dto.request.ScheduleRequest;
import fpt.trainining.movietheatre.dto.response.ScheduleResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ScheduleService {
    ResponseEntity<List<ScheduleResponse>> getAll();
    ResponseEntity<ScheduleResponse> create(ScheduleRequest request);
}
