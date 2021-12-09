package fpt.trainining.movietheatre.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "seat")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Seat {

    @Id
    @Column(length = 10)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer seatId;

    @ManyToOne
    @JoinColumn(name = "cinema_room_id")
    private CinemaRoom cinemaRoom;

    private String seatColumn;

    @Column(length = 10)
    private Integer seatRow;

    @Column(length = 1)
    private Integer seatStatus;

    @Column(length = 1)
    private Integer seatType;
}
