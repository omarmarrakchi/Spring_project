package com.example.springproject.repositories;

import com.example.springproject.entities.Bloc;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBlocRepository extends JpaRepository<Bloc, Long> {
}
