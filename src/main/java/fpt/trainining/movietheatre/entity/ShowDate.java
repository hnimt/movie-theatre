package fpt.trainining.movietheatre.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Collection;
import java.util.Date;

@Entity
@Table(name = "show_dates")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ShowDate {

    @Id
    @Column(length = 10)
    private Integer showDateId;

    private LocalDate showDate;

    private String dateName;

    @ManyToMany(mappedBy = "showDates")
    private Collection<Movie> movies;
}
