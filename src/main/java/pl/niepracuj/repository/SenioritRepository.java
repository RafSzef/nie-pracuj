package pl.niepracuj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.niepracuj.model.entity.Seniority;

@Repository
public interface SenioritRepository extends JpaRepository<Seniority, Long> {
}
