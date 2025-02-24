package com.example.springproject.repositories;

import com.example.springproject.entities.Foyer;
import org.springframework.data.repository.CrudRepository;

public interface IChambreRepository extends CrudRepository<Foyer, Long> {
}
