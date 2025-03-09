package com.example.springproject.services;

import com.example.springproject.entities.Bloc;
import com.example.springproject.entities.Chambre;
import com.example.springproject.entities.TypeChambre;
import com.example.springproject.repositories.IBlocRepository;
import com.example.springproject.repositories.IChambreRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@AllArgsConstructor
public class BlocServiceImpl implements IBlocServices {
    private final IChambreRepository chambreRepository;
    IBlocRepository iBlocRepository;

    @Override
    public List<Bloc> retrieveBlocs() {
        return iBlocRepository.findAll();
    }

    @Override
    public Bloc updateBloc(Bloc bloc) {
        if (iBlocRepository.existsById(bloc.getIdBloc())) {
            return iBlocRepository.save(bloc);
        }
        return null;
    }

    @Override
    public Bloc addBloc(Bloc bloc) {
        return iBlocRepository.save(bloc);
    }

    @Override
    public Bloc retrieveBloc(long idBloc) {
        return iBlocRepository.findById(idBloc).orElse(null);
    }

    @Override
    public void removeBloc(long idBloc) {
        iBlocRepository.deleteById(idBloc);

    }
    // ✅ Ajout du constructeur pour injecter la dépendance
    @Autowired
    public BlocServiceImpl(IChambreRepository chambreRepository) {
        this.chambreRepository = chambreRepository;
    }

    /**
     * Récupérer les chambres non réservées d'un foyer d'une université donnée et de type spécifique.
     */
    public List<Chambre> getChambresNonReserveParNomUniversiteEtTypeChambre(String nomUniversite, TypeChambre type) {
        return chambreRepository.findChambresNonReservees(nomUniversite, type);
    }
}