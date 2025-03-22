package com.example.springproject.repositories;

import com.example.springproject.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface IReservationRepository extends JpaRepository<Reservation, Long> {
    @Query("SELECT r FROM Reservation r " +
            "JOIN r.chambre c " +
            "JOIN c.bloc b " +
            "JOIN b.foyer f " +
            "JOIN f.universite u " +
            "WHERE YEAR(r.anneUniversitaire) = YEAR(:anneeUniversite) " +
            "AND u.nomUniversite = :nomUniversite")
    List<Reservation> findByAnneeUniversitaireAndNomUniversite(
            @Param("anneeUniversite") Date anneeUniversite,
            @Param("nomUniversite") String nomUniversite
    );
}
