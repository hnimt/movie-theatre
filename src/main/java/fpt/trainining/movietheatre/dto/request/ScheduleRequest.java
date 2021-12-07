package fpt.trainining.movietheatre.dto.request;

import lombok.Data;

import java.time.LocalTime;

@Data
public class ScheduleRequest {
    private LocalTime scheduleTime;
}
