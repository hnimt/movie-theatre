package fpt.trainining.movietheatre.dto.request;

import lombok.Data;

@Data
public class TestReq {
    private String movieId;
    private Integer showDateId;
    private Integer scheduleId;
    private String seatIdString;
}
