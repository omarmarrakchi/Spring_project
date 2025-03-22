package com.example.springproject.repositories;

import com.example.springproject.entities.Universite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUniversiteRepository extends JpaRepository<Universite, Long> {
    List<Universite> findByNomUniversite(String keyword);
}
