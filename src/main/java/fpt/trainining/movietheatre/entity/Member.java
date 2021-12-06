package fpt.trainining.movietheatre.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "member")
@Data
@NoArgsConstructor
public class Member {

    @Id
    @Column(length = 10)
    private String memberId;

    @Column(length = 10)
    private Integer score;

    @OneToOne
    @JoinColumn(name = "account_id")
    private Account account;
}
