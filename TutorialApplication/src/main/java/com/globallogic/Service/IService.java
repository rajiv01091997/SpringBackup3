package com.globallogic.Service;

import java.util.List;

//import com.globallogic.Model.Status;
import com.globallogic.Model.Tutorial;

public interface IService {
	
	public Tutorial saveTutorial(Tutorial tutorial);
	public List<Tutorial> getAllTutorial();
	public Tutorial getTutorialById(int id);
	public Tutorial updateTutorialById(Tutorial tutorial, int id);
	public String deleteById(int id);
	public String deleteAll();


//    List<Tutorial> getAllPublished();

    public List<Tutorial> getAllContainingKeyword(String keyword);

}
