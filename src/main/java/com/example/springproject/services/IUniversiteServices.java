package com.example.springproject.services;



import com.example.springproject.entities.Universite;

import java.util.Date;
import java.util.List;

public interface IUniversiteServices {

    List<Universite> retrieveAllUniversities();
    Universite addUniversite (Universite u);
    Universite updateUniversite (Universite u);
    Universite retrieveUniversite (long idUniversite);

    ///
    // Affecter un foyer à une université
    Universite affecterFoyerAUniversite(long idFoyer, String nomUniversite);

    // Désaffecter un foyer d'une université
    Universite desaffecterFoyerAUniversite(long idUniversite);

}