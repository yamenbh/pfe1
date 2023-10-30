package atelier1.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import atelier1.springboot.model.PFE;
import atelier1.springboot.repository.PFERepository;

@RestController
@RequestMapping("/pfe")
public class PFEController {
    @Autowired
    private PFERepository pfeRepository;

    @GetMapping
    public List<PFE> getAllPFE() {
        return pfeRepository.findAll();
    }

    @GetMapping("/{ref}")
    public PFE getPFEByRef(@PathVariable int ref) {
        return pfeRepository.findById(ref).orElse(null);
    }

    @PostMapping
    public void addPFE(@RequestBody PFE pfe) {
        pfeRepository.save(pfe);
    }

    @PutMapping("/{ref}")
    public void updatePFE(@PathVariable int ref, @RequestBody PFE pfe) {
        pfeRepository.save(pfe);
    }

    @DeleteMapping("/{ref}")
    public void deletePFE(@PathVariable int ref) {
        pfeRepository.deleteById(ref);
    }
}
