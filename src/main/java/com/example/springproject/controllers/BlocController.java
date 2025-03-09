package com.example.springproject.controllers;

import com.example.springproject.entities.Bloc;
import com.example.springproject.services.IBlocServices;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/bloc")
@AllArgsConstructor
public class BlocController {
    IBlocServices blocService;


    @GetMapping("/getAllBlocs")
    public List<Bloc> retrieveBlocs() {
        return blocService.retrieveBlocs();
    }


    @GetMapping("/getById/{id}")
    public Bloc retrieveBloc(@PathVariable("id") long idBloc) {
        return blocService.retrieveBloc(idBloc);
    }

    @PostMapping("/addBloc")
    public Bloc addBloc(@RequestBody Bloc bloc) {
        return blocService.addBloc(bloc);
    }

    // Mettre à jour un bloc existant
    @PutMapping("/updateBloc/{id}")
    public Bloc updateBloc(@PathVariable("id") long idBloc, @RequestBody Bloc bloc) {

        return blocService.updateBloc(bloc);
    }

    // Supprimer un bloc par ID
    @DeleteMapping("/removeBloc/{id}")
    public void removeBloc(@PathVariable("id") long idBloc) {
        blocService.removeBloc(idBloc);
    }
}