package fpt.trainining.movietheatre.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "seat")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Ticket {

    @Id
    @Column(length = 10)
    private Integer ticketId;

    @Column(length = 19)
    private Integer price;

    @Column(length = 1)
    private Integer ticketType;
}
