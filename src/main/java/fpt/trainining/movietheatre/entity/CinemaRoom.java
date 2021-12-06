package fpt.trainining.movietheatre.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cinema_room")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CinemaRoom {

    @Id
    @Column(length = 10)
    private Integer roomId;

    private String cinemaRoomName;

    @Column(length = 10)
    private Integer seatQuantity;
}
