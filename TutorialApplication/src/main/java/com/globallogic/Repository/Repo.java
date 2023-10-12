package com.globallogic.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;


import com.globallogic.Model.Tutorial;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo extends MongoRepository<Tutorial, Integer> {

	public List<Tutorial> findByStatus(String status);
}
