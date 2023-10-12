package com.globallogic.Docker.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.globallogic.Docker.Entity.Books;

@org.springframework.stereotype.Repository
public interface Repository extends MongoRepository<Books, Integer>{

}
