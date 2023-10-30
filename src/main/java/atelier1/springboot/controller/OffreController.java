package atelier1.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import atelier1.springboot.model.Offre;
import atelier1.springboot.repository.OffreRepository;

@RestController
@RequestMapping("/offres")
public class OffreController {
    @Autowired
    private OffreRepository offreRepository;

    @GetMapping
    public List<Offre> getAllOffres() {
        return offreRepository.findAll();
    }

    @GetMapping("/{id}")
    public Offre getOffreById(@PathVariable int id) {
        return offreRepository.findById(id).orElse(null);
    }

    @PostMapping
    public void addOffre(@RequestBody Offre offre) {
        offreRepository.save(offre);
    }

    @PutMapping("/{id}")
    public void updateOffre(@PathVariable int id, @RequestBody Offre offre) {
        offreRepository.save(offre);
    }

    @DeleteMapping("/{id}")
    public void deleteOffre(@PathVariable int id) {
        offreRepository.deleteById(id);
    }
}
