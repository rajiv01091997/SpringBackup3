package com.globallogic.Controller;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.globallogic.Model.Tutorial;
import com.globallogic.Service.IService;
import com.globallogic.Service.ServiceImpl;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("api/tutorials")
public class RestController {
     @Autowired
	private ServiceImpl iService;
     
     @PostMapping("")
     public ResponseEntity<Tutorial> saveTutorial(@RequestBody Tutorial tutorial)
     {
    	 return new ResponseEntity<Tutorial>(iService.saveTutorial(tutorial), HttpStatus.OK);
     }
     
	@GetMapping("")
     public ResponseEntity<List<Tutorial>> getAllTutorial()
     {
    	 return new ResponseEntity<List<Tutorial>>(iService.getAllTutorial(), HttpStatus.OK);
     }
	
	 @GetMapping("/{id}")
	public ResponseEntity<Tutorial> getTutorialById(@PathVariable int id)
	{
		return new ResponseEntity<Tutorial>(iService.getTutorialById(id), HttpStatus.OK);
	}
	 
	@PutMapping("/{id}")
	public ResponseEntity<Tutorial> updateTutorialById( @RequestBody  Tutorial tutorial,@PathVariable int id)
	 {
   	 return new ResponseEntity<Tutorial>(iService.updateTutorialById(tutorial, id), HttpStatus.OK);
    } 
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteTutorialById(@PathVariable  int id)
	{
		return new ResponseEntity<String>(iService.deleteById(id), HttpStatus.OK);
	}
	
	@DeleteMapping("")
	public ResponseEntity<String> deleteAll()
	{
		return new ResponseEntity<String>(iService.deleteAll(), HttpStatus.OK);
	}
//	@GetMapping("/published")
//    public ResponseEntity<List<Tutorial>> getByStatus()
//	{
//		return new ResponseEntity<>(iService.getAllPublished(),HttpStatus.OK);
//	}
}
