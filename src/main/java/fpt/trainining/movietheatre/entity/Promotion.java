package fpt.trainining.movietheatre.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

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

    private Timestamp endTime;

    private String image;

    private Timestamp startTime;

    private String title;
}
