package fpt.trainining.movietheatre.dto.invoice;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@NoArgsConstructor
@Data
public class InvoiceReq {
    private String memberId;
    private Integer addScore;
    private LocalDate bookingDate;
    private String movieName;
    private LocalTime scheduleShow;
    private String scheduleShowTime;
    private Integer status;
    private Integer totalMoney;
    private Integer isUseScore;
    private Integer useScore;
    private String seat;
}
