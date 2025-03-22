package com.example.springproject.repositories;

import com.example.springproject.entities.Chambre;
import com.example.springproject.entities.Foyer;
import com.example.springproject.entities.TypeChambre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IChambreRepository extends JpaRepository<Chambre, Long> {
    @Query("SELECT c FROM Chambre c " +
            "WHERE c.bloc.foyer.universite.nomUniversite = :nomUniversite " +
            "AND c.typeC = :type " +
            "AND c NOT IN (SELECT r.chambre FROM Reservation r WHERE r.estValide = true)")
    List<Chambre> findChambresNonReservees(String nomUniversite, TypeChambre type);

    // Solution 1 : Requête JPQL
    @Query("SELECT c FROM Chambre c WHERE c.bloc.idBloc = :idBloc AND c.typeC = :typeC")
    List<Chambre> findChambresParBlocEtTypeJPQL(
            @Param("idBloc") Long idBloc,
            @Param("typeC") TypeChambre typeC
    );

    // Solution 2 : Dérivation par Keywords
    List<Chambre> findByBlocIdBlocAndType(Long idBloc, TypeChambre type);
}
