package fpt.trainining.movietheatre.service.impl;

import fpt.trainining.movietheatre.entity.ScheduleSeat;
import fpt.trainining.movietheatre.exception.ResourceNotFoundException;
import fpt.trainining.movietheatre.repository.ScheduleSeatRepository;
import fpt.trainining.movietheatre.service.ScheduleSeatService;
import fpt.trainining.movietheatre.service.SeatService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ScheduleSeatServiceImpl implements ScheduleSeatService {
    private final ScheduleSeatRepository repository;
    private final SeatService seatService;

    @Override
    public List<ScheduleSeat> getByMovieShowDateSchedule(String movieId, Integer showDateId, Integer scheduleId) {
        return repository.findScheduleSeatByMovieIdAndShowDateIdAndScheduleId(movieId, showDateId, scheduleId)
                .orElseThrow(() -> new ResourceNotFoundException("Cannot find"));
    }

    @Override
    public Boolean changeSeatStatus(String movieId, Integer showDateId, Integer scheduleId, String seatIdString) {
        List<Integer> seatIds = seatService.findIdBySeatName(seatIdString);
        seatIds.stream().forEach(
                seatId -> {
                    ScheduleSeat scheduleSeat
                            = repository.findScheduleSeatByMovieIdAndShowDateIdAndScheduleIdAndSeatId(movieId, showDateId, scheduleId, seatId)
                                    .orElseThrow(() -> new ResourceNotFoundException("Cannot find"));

                    scheduleSeat.setSeatStatus(1 - scheduleSeat.getSeatStatus());
                    repository.save(scheduleSeat);
                }
        );

        return true;
    }

    @Override
    public List<ScheduleSeat> getScheduleSeatChangedStatus(String movieId, Integer showDateId, Integer scheduleId, String seatNamesString) {
        List<Integer> seatIds = seatService.findIdBySeatName(seatNamesString);
        return seatIds.stream().map(
                seatId -> {
                    ScheduleSeat scheduleSeat
                            = repository.findScheduleSeatByMovieIdAndShowDateIdAndScheduleIdAndSeatId(movieId, showDateId, scheduleId, seatId)
                            .orElseThrow(() -> new ResourceNotFoundException("Cannot find"));

                    scheduleSeat.setSeatStatus(1 - scheduleSeat.getSeatStatus());
                    repository.save(scheduleSeat);
                    return scheduleSeat;
                }
        ).collect(Collectors.toList());
    }

}
