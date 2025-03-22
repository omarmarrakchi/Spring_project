package com.example.springproject.services;



import com.example.springproject.entities.Chambre;
import com.example.springproject.entities.Foyer;
import com.example.springproject.entities.TypeChambre;

import java.util.List;

public interface IChambreServices {
    List<Chambre> retrieveAllChambres();
    Chambre addChambre(Chambre c);
    Chambre updateChambre (Chambre c);
    Foyer retrieveChambre (long idChambre);
    List<Chambre> getChambresNonReserveParNomUniversiteEtTypeChambre(String nomUniversite, TypeChambre type);
    List<Chambre> getChambresParBlocEtType(Long idBloc, TypeChambre typeC);

}
