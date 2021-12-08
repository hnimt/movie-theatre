package fpt.trainining.movietheatre.controller;

import fpt.trainining.movietheatre.dto.cinema_room.CinemaRoomReq;
import fpt.trainining.movietheatre.dto.cinema_room.CinemaRoomRes;
import fpt.trainining.movietheatre.service.CinemaRoomService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/cinema-room")
@AllArgsConstructor
public class CinemaRoomController {
    private final CinemaRoomService service;

    @GetMapping("/get")
    public ResponseEntity<List<CinemaRoomRes>> getAll() {
        return service.getAll();
    }

    @PostMapping("/create")
    public ResponseEntity<CinemaRoomRes> create(@RequestBody @Valid CinemaRoomReq req) {
        return service.create(req);
    }
}
