package fpt.trainining.movietheatre.dto.request;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.time.LocalTime;

@Data
public class ScheduleRequest {
    @NotNull
    private LocalTime scheduleTime;
}
