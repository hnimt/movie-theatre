package fpt.trainining.movietheatre.dto.response;

import fpt.trainining.movietheatre.entity.Schedule;
import fpt.trainining.movietheatre.entity.ShowDate;
import fpt.trainining.movietheatre.entity.Type;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Collection;
import java.util.Set;

@Data
public class MovieResponse {
    private String actor;

    private Integer cinemaRoomId;

    private String content;

    private String director;

    private Integer duration;

    private LocalDate fromDate;

    private String movieProductionCompany;

    private LocalDate toDate;

    private String version;

    private String movieNameEnglish;

    private String movieNameVn;

    private String largeImage;

    private String smallImage;

    private Set<LocalDate> showDates;

    private Set<LocalTime> scheduleTimes;

    private Set<String> typeNames;
}
