package fpt.trainining.movietheatre.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "invoice")
@NoArgsConstructor
@Data
public class Invoice {

    @Id
    @Column(name = "invoice_id", length = 10)
    private String invoiceId;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;

    @Column(name = "add_score", length = 10)
    private Integer addScore;

    @Column(name = "booking_date")
    private Timestamp bookingDate;

    @Column(name = "movie_name")
    private String movieName;

    @Column(name = "schedule_show")
    private Date scheduleShow;

    @Column(name = "schedule_show_time")
    private String scheduleShowTime;

    @Column(name = "status", length = 1)
    private Integer status;

    @Column(name = "total_money", length = 19)
    private Integer totalMoney;

    @Column(name = "user_score", length = 10)
    private Integer userScore;

    @Column(name = "seat")
    private String seat;
}
