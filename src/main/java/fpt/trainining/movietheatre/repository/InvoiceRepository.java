package fpt.trainining.movietheatre.repository;

import fpt.trainining.movietheatre.entity.Account;
import fpt.trainining.movietheatre.entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, String> {
    @Query(nativeQuery = true, value = "SELECT * FROM invoice i WHERE i.account_id = ?1")
    Optional<List<Invoice>> findByAccountId(String accountId);

    Optional<List<Invoice>> findByAccount(Account account);
}
