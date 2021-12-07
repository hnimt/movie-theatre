package fpt.trainining.movietheatre.dto.response;

import fpt.trainining.movietheatre.entity.Movie;
import lombok.Data;

import java.time.LocalTime;
import java.util.Collection;

@Data
public class ScheduleResponse {
    private Integer scheduleId;

    private LocalTime scheduleTime;

    private Collection<Movie> movies;
}
