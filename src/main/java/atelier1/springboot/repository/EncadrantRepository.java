package atelier1.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import atelier1.springboot.model.Encadrant;

@Repository
public interface EncadrantRepository extends JpaRepository<Encadrant, Integer> {
    List<Encadrant> findBySpecialite(String specialite);
    List<Encadrant> findAll(); 

}
