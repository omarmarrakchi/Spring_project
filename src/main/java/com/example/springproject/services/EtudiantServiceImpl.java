package com.example.springproject.services;

import com.example.springproject.entities.Etudiant;
import com.example.springproject.repositories.IEtudiantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@AllArgsConstructor
public class EtudiantServiceImpl implements  IEtudiantServices {
    IEtudiantRepository iEtudiantRepository;


    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        return iEtudiantRepository.findAll();
    }

    @Override
    public List<Etudiant> addEtudiants(List<Etudiant> etudiants) {
        return iEtudiantRepository.saveAll(etudiants);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        if (iEtudiantRepository.existsById(e.getIdEtudiant())) {
            return iEtudiantRepository.save(e);
        }
        return null;
    }

    @Override
    public Etudiant retrieveEtudiant(long idEtudiant) {
        return iEtudiantRepository.findById(idEtudiant).orElse(null);
    }

    @Override
    public void removeEtudiant(long idEtudiant) {
        iEtudiantRepository.deleteById(idEtudiant);

    }
}