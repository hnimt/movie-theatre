package fpt.trainining.movietheatre.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
@Table(name = "movie")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Movie {

    @Id
    @Column(length = 10)
    private String movieId;

    private String actor;

    @Column(length = 10)
    private Integer cinemaRoomId;

    private String content;

    private String director;

    private Integer duration;

    private Date fromDate;

    private String movieProductionCompany;

    private Date toDate;

    private String version;

    private String movieNameEnglish;

    private String movieNameVn;

    private String largeImage;

    private String smallImage;

    @ManyToMany
    @JoinTable(name = "movie_date", joinColumns = @JoinColumn(name = "movie_id"), inverseJoinColumns = @JoinColumn(name = "show_date_id"))
    private Collection<ShowDate> showDates;

    @ManyToMany
    @JoinTable(name = "movie_schedule", joinColumns = @JoinColumn(name = "movie_id"), inverseJoinColumns = @JoinColumn(name = "schedule_id"))
    private Collection<Schedule> schedules;

    @ManyToMany
    @JoinTable(name = "movie_type", joinColumns = @JoinColumn(name = "movie_id"), inverseJoinColumns = @JoinColumn(name = "type_id"))
    private Collection<Type> types;
}
