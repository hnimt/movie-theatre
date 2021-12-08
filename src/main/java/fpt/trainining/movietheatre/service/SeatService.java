package fpt.trainining.movietheatre.service;

import fpt.trainining.movietheatre.dto.seat.SeatReq;
import fpt.trainining.movietheatre.dto.seat.SeatRes;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface SeatService {
    ResponseEntity<List<SeatRes>> getAll();
    ResponseEntity<SeatRes> create(SeatReq req);
}
