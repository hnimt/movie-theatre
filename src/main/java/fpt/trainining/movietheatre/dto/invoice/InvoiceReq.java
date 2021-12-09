package fpt.trainining.movietheatre.dto.invoice;

import fpt.trainining.movietheatre.entity.Account;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@NoArgsConstructor
@Data
public class InvoiceReq {
    private String accountId;
    private Integer addScore;
    private LocalDate bookingDate;
    private String movieName;
    private LocalTime scheduleShow;
    private String scheduleShowTime;
    private Integer status;
    private Integer totalMoney;
    private Integer useScore;
    private String seat;
}
