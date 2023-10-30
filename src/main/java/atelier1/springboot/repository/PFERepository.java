package atelier1.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import atelier1.springboot.model.PFE;

@Repository
public interface PFERepository extends JpaRepository<PFE, Integer> {
    // Custom query to find PFEs by their company name
    List<PFE> findByEntreprise(String entreprise);
    
    List<PFE> findAll(); // Find all PFEs

}
