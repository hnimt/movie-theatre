package fpt.trainining.movietheatre.service.impl;

import fpt.trainining.movietheatre.dto.seat.SeatReq;
import fpt.trainining.movietheatre.dto.seat.SeatRes;
import fpt.trainining.movietheatre.entity.CinemaRoom;
import fpt.trainining.movietheatre.entity.Seat;
import fpt.trainining.movietheatre.repository.CinemaRoomRepository;
import fpt.trainining.movietheatre.repository.SeatRepository;
import fpt.trainining.movietheatre.service.SeatService;
import fpt.trainining.movietheatre.service.mapper.SeatMapper;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class SeatServiceImpl implements SeatService {
    private final SeatMapper mapper;
    private final SeatRepository repository;

    @Override
    public ResponseEntity<List<SeatRes>> getAll() {
        List<Seat> seats = repository.findAll();

        List<SeatRes> seatRes = seats.stream()
                .map(mapper::map)
                .collect(Collectors.toList());

        return ResponseEntity.ok(seatRes);
    }

    @Override
    public ResponseEntity<SeatRes> create(SeatReq req) {
        Seat seat = mapper.map(req);

        repository.save(seat);

        return ResponseEntity.ok(mapper.map(seat));
    }
}
