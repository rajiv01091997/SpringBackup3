package com.globallogic.Docker.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.globallogic.Docker.Entity.Books;
import com.globallogic.Docker.Repo.Repository;

@RestController
@RequestMapping("api/v1")
public class DockerController {
	@Autowired
private Repository repository;
	
	@GetMapping("/book")
	public List<Books> getMessage()
	{
		return repository.findAll();
	}
	@PostMapping("/book")
	public Books saveIt(@RequestBody Books books)
	{
	return repository.save(books);	
	}
	
}
