package pl.niepracuj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.niepracuj.model.entity.Aplication;

@Repository
public interface AplicationRepository extends JpaRepository<Aplication, Long> {
}
