package fpt.trainining.movietheatre.dto.response;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
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

    private Set<Integer> showDateId;

    private Set<Integer> scheduleId;

    private Set<Integer> typeId;
}
