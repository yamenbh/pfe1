package atelier1.springboot.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import atelier1.springboot.model.Encadrant;
import atelier1.springboot.repository.EncadrantRepository;

@RestController
@RequestMapping("/encadrants")
public class EncadrantController {
    @Autowired
    private EncadrantRepository encadrantRepository;

    @GetMapping
    public List<Encadrant> getAllEncadrants() {
        return encadrantRepository.findAll();
    }

    @GetMapping("/{id}")
    public Encadrant getEncadrantById(@PathVariable int id) {
        return encadrantRepository.findById(id).orElse(null);
    }

    @PostMapping
    public void addEncadrant(@RequestBody Encadrant encadrant) {
        encadrantRepository.save(encadrant);
    }

    @PutMapping("/{id}")
    public void updateEncadrant(@PathVariable int id, @RequestBody Encadrant encadrant) {
        encadrantRepository.save(encadrant);
    }

    @DeleteMapping("/{id}")
    public void deleteEncadrant(@PathVariable int id) {
        encadrantRepository.deleteById(id);
    }
}
