package fpt.trainining.movietheatre.dto.cinema_room;

import fpt.trainining.movietheatre.entity.CinemaRoom;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class CinemaRoomMapper {
    private ModelMapper mapper;

    public CinemaRoom map(CinemaRoomReq req) {
        return mapper.map(req, CinemaRoom.class);
    }

    public CinemaRoomRes map(CinemaRoom cinemaRoom) {
        return mapper.map(cinemaRoom, CinemaRoomRes.class);
    }
}
