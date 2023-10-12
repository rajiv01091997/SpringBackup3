package com.globallogic.Service;

import com.globallogic.Entity.Actors;

import java.util.List;

public interface IActorService {


    Actors saveActor(Actors actor);

    Actors findById(int id);

    List<Actors> findByYearOfBirth(int yearOfBirth);
}
