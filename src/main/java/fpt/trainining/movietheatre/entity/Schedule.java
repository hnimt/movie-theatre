package fpt.trainining.movietheatre.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "schedule")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Schedule {

    @Id
    @Column(length = 10)
    private Integer scheduleId;

    private String scheduleTime;

    @ManyToMany(mappedBy = "schedules")
    private Collection<Movie> movies;
}
