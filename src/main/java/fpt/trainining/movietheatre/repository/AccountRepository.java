package fpt.trainining.movietheatre.repository;

import fpt.trainining.movietheatre.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<Account, String> {
    Optional<Account>  findByUsername(String username);
}
