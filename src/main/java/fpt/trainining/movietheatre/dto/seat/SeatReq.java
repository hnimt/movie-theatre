package fpt.trainining.movietheatre.dto.seat;

import com.sun.istack.NotNull;
import lombok.Data;

@Data
public class SeatReq {
    @NotNull
    private Integer cinemaRoomId;

    private String seatColumn;

    private Integer seatRow;

    private Integer seatStatus;

    private Integer seatType;
}
