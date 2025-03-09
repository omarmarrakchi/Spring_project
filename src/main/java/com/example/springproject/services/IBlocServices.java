package com.example.springproject.services;



import com.example.springproject.entities.Bloc;

import java.util.List;

public interface IBlocServices {
    List<Bloc> retrieveBlocs();
    Bloc updateBloc (Bloc bloc);
    Bloc addBloc (Bloc bloc);
    Bloc retrieveBloc (long idBloc);
    void removeBloc (long idBloc);

}