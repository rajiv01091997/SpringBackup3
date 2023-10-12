package com.globallogic.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.globallogic.Entity.Book;
@Repository
public interface MongoRepo extends MongoRepository<Book, Integer> {

}
