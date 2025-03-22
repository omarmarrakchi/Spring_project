package com.example.springproject.controllers;
import com.example.springproject.entities.Chambre;
import com.example.springproject.entities.TypeChambre;
import com.example.springproject.services.IChambreServices;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/chambre")
@AllArgsConstructor
public class ChambreController {
    IChambreServices chambreService;

    @GetMapping("/getAllChambres")
    public List<Chambre> retrieveAllChambres() {
        return chambreService.retrieveAllChambres();
    }


    @GetMapping("/getById/{id}")
    public Chambre retrieveChambre(@PathVariable("id") long idChambre) {
        return chambreService.retrieveChambre(idChambre);
    }


    @PostMapping("/addChambre")
    public Chambre addChambre(@RequestBody Chambre chambre) {
        return chambreService.addChambre(chambre);
    }

    // Mettre à jour une chambre existante
    @PutMapping("/updateChambre/{id}")
    public Chambre updateChambre(@PathVariable("id") long idChambre, @RequestBody Chambre chambre) {

        return chambreService.updateChambre(chambre);
    }
}