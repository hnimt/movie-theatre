package fpt.trainining.movietheatre.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.Collection;

@Entity
@Table(name = "schedule")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Schedule {

    @Id
    @Column(length = 10)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer scheduleId;

    private LocalTime scheduleTime;

    @ManyToMany(mappedBy = "schedules")
    private Collection<Movie> movies;
}
