package fpt.trainining.movietheatre.dto.member;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MemberCreateReq {
    private Integer score;
    private String accountId;
}
