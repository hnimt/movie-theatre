package fpt.trainining.movietheatre.service.mapper;

import fpt.trainining.movietheatre.dto.request.MovieRequest;
import fpt.trainining.movietheatre.dto.response.MovieResponse;
import fpt.trainining.movietheatre.entity.Movie;
import fpt.trainining.movietheatre.entity.Schedule;
import fpt.trainining.movietheatre.entity.ShowDate;
import fpt.trainining.movietheatre.entity.Type;
import fpt.trainining.movietheatre.repository.ScheduleRepository;
import fpt.trainining.movietheatre.repository.ShowDateRepository;
import fpt.trainining.movietheatre.repository.TypeRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
@AllArgsConstructor
public class MovieMapper {
    private final ModelMapper mapper;
    private final ShowDateRepository showDateRepository;
    private final ScheduleRepository scheduleRepository;
    private final TypeRepository typeRepository;

    public Movie map(MovieRequest request) {
        Movie movie = mapper.map(request, Movie.class);

        List<ShowDate> showDates = new ArrayList<>();
        request.getShowDateId().stream().forEach(
                showDateId -> {
                    showDates.add(showDateRepository.findById(showDateId).get());
                }
        );
        movie.setShowDates(showDates);

        List<Schedule> schedules = new ArrayList<>();
        request.getScheduleId().stream().forEach(
                scheduleId -> {
                    schedules.add(scheduleRepository.findById(scheduleId).get());
                }
        );
        movie.setSchedules(schedules);

        List<Type> types = new ArrayList<>();
        request.getTypeId().stream().forEach(
                typeId -> {
                    types.add(typeRepository.findById(typeId).get());
                }
        );
        movie.setTypes(types);

        return movie;
    }

    public MovieResponse map(Movie movie) {
//        MovieResponse response = new MovieResponse();
//
//        response.setActor(movie.getActor());
//        response.setCinemaRoomId(movie.getCinemaRoomId());
//        response.setContent(movie.getContent());
//        response.setDirector(movie.getDirector());
//        response.setDuration(movie.getDuration());
//        response.setFromDate(movie.getFromDate());
//        response.setMovieProductionCompany(movie.getMovieProductionCompany());
//        response.setToDate(movie.getToDate());
//        response.setVersion(movie.getVersion());
//        response.setMovieNameEnglish(movie.getMovieNameEnglish());
//        response.setMovieNameVn(movie.getMovieNameVn());
        MovieResponse response = mapper.map(movie, MovieResponse.class);

//        response.setShowDates(
//                movie.getShowDates().stream()
//                        .map(showDate -> showDate.getShowDate())
//                        .collect(Collectors.toSet())
//        );
//
//        response.setScheduleTimes(
//                movie.getSchedules().stream()
//                        .map(schedule -> schedule.getScheduleTime())
//                        .collect(Collectors.toSet())
//        );
//
//        response.setTypeNames(
//                movie.getTypes().stream()
//                        .map(type -> type.getTypeName())
//                        .collect(Collectors.toSet())
//        );

        return response;
    }
}
