package fpt.trainining.movietheatre.service;

import fpt.trainining.movietheatre.dto.seat.SeatIdReq;
import fpt.trainining.movietheatre.dto.seat.SeatReq;
import fpt.trainining.movietheatre.dto.seat.SeatRes;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface SeatService {
    ResponseEntity<List<SeatRes>> getAll();
    ResponseEntity<SeatRes> create(SeatReq req);
    ResponseEntity<SeatRes> changeType(SeatIdReq req);
    ResponseEntity<SeatRes> changeStatus(SeatIdReq req);
    ResponseEntity delete(Integer seatId);
}
