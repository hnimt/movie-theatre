package fpt.trainining.movietheatre.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "employee")
@Data
@NoArgsConstructor
public class Employee {

    @Id
    @Column(length = 10)
    private String employeeId;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;
}
