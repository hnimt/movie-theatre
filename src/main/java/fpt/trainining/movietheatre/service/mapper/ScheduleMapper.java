package fpt.trainining.movietheatre.service.mapper;

import fpt.trainining.movietheatre.dto.request.ScheduleRequest;
import fpt.trainining.movietheatre.dto.response.ScheduleResponse;
import fpt.trainining.movietheatre.entity.Schedule;
import org.springframework.stereotype.Component;

@Component
public class ScheduleMapper {
    public Schedule map(ScheduleRequest request) {
        Schedule schedule = new Schedule();

        schedule.setScheduleTime(request.getScheduleTime());

        return schedule;
    }

    public ScheduleResponse map(Schedule schedule) {
        ScheduleResponse response = new ScheduleResponse();

        response.setScheduleId(schedule.getScheduleId());
        response.setScheduleTime(schedule.getScheduleTime());
//        response.setMovies(schedule.getMovies());

        return response;
    }
}
