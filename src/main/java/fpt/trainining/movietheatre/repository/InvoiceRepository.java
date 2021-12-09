package fpt.trainining.movietheatre.repository;

import fpt.trainining.movietheatre.entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, String> {
    @Query("select i from Invoice i where i.account = (select a from Account a where a.accountId = :accountId)")
    List<Invoice> findByAccountId(@Param("accountId") String accountId);
}
