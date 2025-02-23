package com.example.springproject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Reservation implements Serializable {
    @Id
    private String idResvation;
    @Temporal( TemporalType.DATE)
    private Date anneUniversitaire;
    private boolean estValide;

    @ManyToMany
    private List<Etudiant> etudiants;
}
