package fpt.trainining.movietheatre.service.mapper;

import fpt.trainining.movietheatre.dto.seat.SeatReq;
import fpt.trainining.movietheatre.dto.seat.SeatRes;
import fpt.trainining.movietheatre.entity.CinemaRoom;
import fpt.trainining.movietheatre.entity.Seat;
import fpt.trainining.movietheatre.repository.CinemaRoomRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@AllArgsConstructor
public class SeatMapper {
    private final ModelMapper mapper;
    private final CinemaRoomRepository cinemaRoomRepository;

    public Seat map(SeatReq req) {
        Seat seat = mapper.map(req, Seat.class);

        Optional<CinemaRoom> optionalCinemaRoom = cinemaRoomRepository.findById(req.getCinemaRoomId());
        seat.setCinemaRoom(optionalCinemaRoom.get());

        return seat;
    }

    public SeatRes map(Seat seat) {
        return mapper.map(seat, SeatRes.class);
    }
}
