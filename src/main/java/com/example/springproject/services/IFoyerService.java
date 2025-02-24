package com.example.springproject.services;

import com.example.springproject.entities.Foyer;

import java.util.List;

public interface IFoyerService {
    public Foyer findById(long id);
    public List<Foyer> findAll();
    public Foyer save(Foyer foyer);
    public void delete(Long id);
}
