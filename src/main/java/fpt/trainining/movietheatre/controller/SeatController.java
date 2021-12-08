package fpt.trainining.movietheatre.controller;

import fpt.trainining.movietheatre.dto.seat.SeatChangeTypeReq;
import fpt.trainining.movietheatre.dto.seat.SeatReq;
import fpt.trainining.movietheatre.dto.seat.SeatRes;
import fpt.trainining.movietheatre.service.SeatService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/seat")
@AllArgsConstructor
public class SeatController {
    private final SeatService service;

    @GetMapping("/get")
    public ResponseEntity<List<SeatRes>> getAll() {
        return service.getAll();
    }

    @PostMapping("/create")
    public ResponseEntity<SeatRes> create(@RequestBody @Valid SeatReq req) {
        return service.create(req);
    }

    @PutMapping("/change-type")
    public ResponseEntity<SeatRes> changeType(@RequestBody @Valid SeatChangeTypeReq req) {
        return service.changeType(req);
    }
}
