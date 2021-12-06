package fpt.trainining.movietheatre.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@Table(name = "account")
public class Account {

    @Id
    @Column(name = "account_id", length = 10)
    @GeneratedValue(generator = "account-generator")
    @GenericGenerator(
            name = "account-generator",
            parameters = @org.hibernate.annotations.Parameter(name = "prefix", value = "ACC"),
            strategy = "fpt.trainining.movietheatre.generator.MyGenerator"
    )
    private String accountId;

    private String address;

    private LocalDate dateOfBirth;

    private String email;

    private String fullName;

    private String gender;

    private String identityCard;

    private String image;

    private String password;

    private String phoneNumber;

    private LocalDate registerDate;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

    @Column(length = 1)
    private Integer status;

    private String username;
}
