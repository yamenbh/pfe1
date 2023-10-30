package atelier1.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import atelier1.springboot.model.Offre;

@Repository
public interface OffreRepository extends JpaRepository<Offre, Integer> {
	 List<Offre> findByTechno(String techno);
	 List<Offre> findAll(); 

}
