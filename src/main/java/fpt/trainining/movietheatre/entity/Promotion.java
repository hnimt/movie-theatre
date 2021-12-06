package fpt.trainining.movietheatre.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Table(name = "promotion")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Promotion {

    @Id
    @Column(length = 10)
    private Integer promotionId;

    private String detail;

    @Column(length = 10)
    private Integer discountLevel;

    private LocalDateTime endTime;

    private String image;

    private LocalDateTime startTime;

    private String title;
}
