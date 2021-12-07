package fpt.trainining.movietheatre.repository;

import fpt.trainining.movietheatre.entity.ShowDate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShowDateRepository extends JpaRepository<ShowDate, Integer> {
}
