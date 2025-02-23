package com.example.springproject.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Bloc implements Serializable {
    @Id
    private long idBloc;
    private String nomBloc;
    private long capaciteBloc;

    @OneToMany(mappedBy = "bloc")
    private List<Chambre> chambres;

    @ManyToOne
    private Foyer foyer;
}
