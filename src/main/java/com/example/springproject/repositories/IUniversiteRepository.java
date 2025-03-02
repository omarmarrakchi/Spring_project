package com.example.springproject.repositories;

import com.example.springproject.entities.Universite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUniversiteRepository extends JpaRepository<Universite, Long> {
}
