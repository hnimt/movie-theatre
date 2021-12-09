package fpt.trainining.movietheatre.service;

import fpt.trainining.movietheatre.dto.request.ScheduleRequest;
import fpt.trainining.movietheatre.dto.response.ScheduleResponse;
import fpt.trainining.movietheatre.entity.Schedule;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ScheduleService {
    ResponseEntity<List<ScheduleResponse>> getAll();
    ResponseEntity<ScheduleResponse> create(ScheduleRequest request);

    Schedule findById(Integer scheduleId);
}
