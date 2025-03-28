package com.example.springproject.repositories;

import com.example.springproject.entities.Foyer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFoyerRepository extends JpaRepository<Foyer, Long> {
    public Foyer findByNomFoyerAndCapaciteFoyer(String nomFoyer, Long capaciteFoyer);

}
