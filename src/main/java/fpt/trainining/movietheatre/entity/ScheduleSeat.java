package fpt.trainining.movietheatre.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "schedule_seat")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ScheduleSeat {

    @Id
    @Column(length = 10)
    private String scheduleSeatId;

}
