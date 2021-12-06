package fpt.trainining.movietheatre.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@Table(name = "account")
public class Account {

    @Id
    @Column(name = "account_id", length = 10)
    private String accountId;

    private String address;

    private Date dateOfBirth;

    private String email;

    private String fullName;

    private String gender;

    private String identityCard;

    private String image;

    private String password;

    private String phoneNumber;

    private Date registerDate;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

    @Column(length = 1)
    private Integer status;

    private String username;
}
