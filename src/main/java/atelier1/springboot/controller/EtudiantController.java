package atelier1.springboot.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import atelier1.springboot.model.Etudiant;
import atelier1.springboot.repository.EtudiantRepository;

@RestController
@RequestMapping("/etudiants")
public class EtudiantController {
    @Autowired
    private EtudiantRepository etudiantRepository;

    @GetMapping
    public List<Etudiant> getAllEtudiants() {
        return etudiantRepository.findAll();
    }

    @GetMapping("/{id}")
    public Etudiant getEtudiantById(@PathVariable int id) {
        return etudiantRepository.findById(id).orElse(null);
    }

    @PostMapping
    public void addEtudiant(@RequestBody Etudiant etudiant) {
        etudiantRepository.save(etudiant);
    }

    @PutMapping("/{id}")
    public void updateEtudiant(@PathVariable int id, @RequestBody Etudiant etudiant) {
        etudiantRepository.save(etudiant);
    }

    @DeleteMapping("/{id}")
    public void deleteEtudiant(@PathVariable int id) {
        etudiantRepository.deleteById(id);
    }
}
