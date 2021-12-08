package fpt.trainining.movietheatre.dto.request;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
public class ShowDateRequest {
    @NotNull
    private LocalDate showDate;
}
