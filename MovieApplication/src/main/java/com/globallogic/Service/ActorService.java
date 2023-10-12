package com.globallogic.Service;

import com.globallogic.Entity.Actors;
import com.globallogic.Repository.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public class ActorService implements IActorService{
    @Autowired
    private ActorRepository actorRepository;
    @Override
    public Actors saveActor(Actors actor)
    {
        return actorRepository.save(actor);
    }
    @Override
    public Actors findById(int id)
    {
        return actorRepository.findById(id).get();
    }
    @Override
    public List<Actors> findByYearOfBirth(int yearOfBirth)
    {
     return actorRepository.findAllByYearOfBirthGreaterThan(yearOfBirth);
    }

    public List<Actors> getActorsByNameEndingWith(@PathVariable String match)
    {
         return actorRepository.findAllByFirstNameEndingWith(match);
    }
}
