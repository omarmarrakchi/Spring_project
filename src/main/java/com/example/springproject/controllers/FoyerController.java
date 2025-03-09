package com.example.springproject.controllers;
import com.example.springproject.entities.Foyer;
import com.example.springproject.services.IFoyerServices;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/foyer")
@AllArgsConstructor
public class FoyerController {
    IFoyerServices foyerService;

    @PostMapping("/saveFoyer")
    public Foyer saveFoyer(@RequestBody Foyer foyer) {
        return foyerService.save(foyer);
    }

    @GetMapping("/getById/{id}")
    public Foyer getFoyer(@PathVariable("id") Long id) {
        return foyerService.findById(id);
    }
    @GetMapping("/getByNomCapacite/{nom}/{capacite}")
    public Foyer getFoyer(@PathVariable("nom") String nom, @PathVariable("capacite") Long capacite) {
        return foyerService.getNomCapacite(nom, capacite);
    }
}