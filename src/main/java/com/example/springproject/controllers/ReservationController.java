package com.example.springproject.controllers;
import com.example.springproject.entities.Reservation;
import com.example.springproject.services.IReservationServices;
import lombok.AllArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/reservation")
@AllArgsConstructor
public class ReservationController {


    IReservationServices reservationService;


    @GetMapping("/getAllReservations")
    public List<Reservation> retrieveAllReservations() {
        return reservationService.retrieveAllReservation();
    }


    @GetMapping("/getById/{id}")
    public Reservation retrieveReservation(@PathVariable("id") Long idReservation) {
        return reservationService.retrieveReservation(idReservation);
    }


    @PutMapping("/updateReservation/{id}")
    public Reservation updateReservation(@PathVariable("id") Long idReservation, @RequestBody Reservation reservation) {

        return reservationService.updateReservation(reservation);
    }

    @GetMapping("/byAnneeAndUniversite")
    public ResponseEntity<List<Reservation>> getReservationParAnneeUniversitaireEtNomUniversite(
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date anneeUniversite,
            @RequestParam String nomUniversite
    ) {
        List<Reservation> reservations = reservationService.getReservationParAnneeUniversitaireEtNomUniversite(anneeUniversite, nomUniversite);
        if (reservations.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(reservations);
    }
}