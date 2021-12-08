package fpt.trainining.movietheatre.dto.seat;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class SeatChangeTypeReq {
    @NotNull
    private Integer seatId;
}
