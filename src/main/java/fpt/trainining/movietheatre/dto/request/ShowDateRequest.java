package fpt.trainining.movietheatre.dto.request;

import fpt.trainining.movietheatre.entity.common.DayName;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
public class ShowDateRequest {
    @NotNull
    private LocalDate showDate;
}
