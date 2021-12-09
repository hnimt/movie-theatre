package fpt.trainining.movietheatre.service;

import fpt.trainining.movietheatre.entity.ScheduleSeat;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ScheduleSeatService {
    List<ScheduleSeat> getByMovieShowDateSchedule(String movieId, Integer showDateId, Integer scheduleId);

    Boolean changeSeatStatus(String movieId, Integer showDateId, Integer scheduleId, String seatId);
}
