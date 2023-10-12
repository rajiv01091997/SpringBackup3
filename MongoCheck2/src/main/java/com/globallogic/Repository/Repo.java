package com.globallogic.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.globallogic.Entity.Person;

public interface Repo extends MongoRepository<Person, Integer> {

}
