package com.example.WishlistProject.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.WishlistProject.Entity.Wishlist;
@Repository
public interface WishlistRepo extends MongoRepository<Wishlist, String> {

}
