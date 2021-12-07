package fpt.trainining.movietheatre.service.mapper;

import fpt.trainining.movietheatre.dto.request.MovieRequest;
import fpt.trainining.movietheatre.dto.response.MovieResponse;
import fpt.trainining.movietheatre.entity.Movie;
import org.springframework.stereotype.Component;

@Component
public class MovieMapper {
    public Movie map(MovieRequest request) {
        Movie movie = new Movie();

        movie.setActor(request.getActor());
        movie.setCinemaRoomId(request.getCinemaRoomId());
        movie.setContent(request.getContent());
        movie.setDirector(request.getDirector());
        movie.setDuration(request.getDuration());
        movie.setFromDate(request.getFromDate());
        movie.setMovieProductionCompany(request.getMovieProductionCompany());
        movie.setToDate(request.getToDate());
        movie.setVersion(request.getVersion());
        movie.setMovieNameEnglish(request.getMovieNameEnglish());
        movie.setMovieNameVn(request.getMovieNameVn());

        return movie;
    }

    public MovieResponse map(Movie movie) {
        MovieResponse response = new MovieResponse();

        response.setActor(movie.getActor());
        response.setCinemaRoomId(movie.getCinemaRoomId());
        response.setContent(movie.getContent());
        response.setDirector(movie.getDirector());
        response.setDuration(movie.getDuration());
        response.setFromDate(movie.getFromDate());
        response.setMovieProductionCompany(movie.getMovieProductionCompany());
        response.setToDate(movie.getToDate());
        response.setVersion(movie.getVersion());
        response.setMovieNameEnglish(movie.getMovieNameEnglish());
        response.setMovieNameVn(movie.getMovieNameVn());

        return response;
    }
}
