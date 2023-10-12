package com.globallogic.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.globallogic.Model.Status;
import com.globallogic.Model.Tutorial;
import com.globallogic.Repository.Repo;
@Service
public class ServiceImpl implements IService {
	
	@Autowired
	private Repo repo;

	@Override
	public Tutorial saveTutorial(Tutorial tutorial) {
		
		return repo.save(tutorial);
	}

	@Override
	public List<Tutorial> getAllTutorial() {
		
		return repo.findAll();
	}

	@Override
	public Tutorial getTutorialById(int id) {
		
		Tutorial tut=repo.findById(id).get();
		return tut;
	}

	@Override
	public Tutorial updateTutorialById(Tutorial tutorial, int id) {
		
		Tutorial previousTutorial=repo.findById(id).get();
		System.out.println(previousTutorial);
		previousTutorial.setTitle(tutorial.getTitle());
		previousTutorial.setDescription(tutorial.getDescription());
		previousTutorial.setStatus(tutorial.getStatus());
		System.out.println(previousTutorial);
		return repo.save(previousTutorial);
	}

	@Override
	public String deleteById(int id) {
	
		repo.deleteById(id);
		return "Deleted tutorial with id"+ id;
	}

	@Override
	public String deleteAll() {
		
		repo.deleteAll();
		return "All tutorials Deleted";
	}

//	@Override
//	public List<Tutorial> getAllPublished() {
//
//		return repo.findByStatus();
//	}

	@Override
	public List<Tutorial> getAllContainingKeyword(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

}
