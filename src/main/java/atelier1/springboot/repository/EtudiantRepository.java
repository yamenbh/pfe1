package atelier1.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import atelier1.springboot.model.Etudiant;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant, Integer> {
	
    List<Etudiant> findByNom(String nom);

    List<Etudiant> findByGroupe(String groupe);
    
    List<Etudiant> findAll();

}
