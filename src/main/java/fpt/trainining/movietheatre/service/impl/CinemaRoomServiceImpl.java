package fpt.trainining.movietheatre.service.impl;

import fpt.trainining.movietheatre.dto.cinema_room.CinemaRoomMapper;
import fpt.trainining.movietheatre.dto.cinema_room.CinemaRoomReq;
import fpt.trainining.movietheatre.dto.cinema_room.CinemaRoomRes;
import fpt.trainining.movietheatre.entity.CinemaRoom;
import fpt.trainining.movietheatre.repository.CinemaRoomRepository;
import fpt.trainining.movietheatre.service.CinemaRoomService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CinemaRoomServiceImpl implements CinemaRoomService {
    private final CinemaRoomMapper mapper;
    private final CinemaRoomRepository repository;

    @Override
    public ResponseEntity<List<CinemaRoomRes>> getAll() {
        List<CinemaRoom> cinemaRooms = repository.findAll();

        List<CinemaRoomRes> cinemaRoomRes = cinemaRooms.stream()
                .map(mapper::map)
                .collect(Collectors.toList());

        return ResponseEntity.ok(cinemaRoomRes);
    }

    @Override
    public ResponseEntity<CinemaRoomRes> create(CinemaRoomReq req) {
        CinemaRoom cinemaRoom = mapper.map(req);

        repository.save(cinemaRoom);

        return ResponseEntity.ok(mapper.map(cinemaRoom));
    }
}
