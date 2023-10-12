package com.globallogic.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.Entity.Book;
import com.globallogic.Service.Operations;

@RestController
@RequestMapping("v1/mongodbapp/books")
public class Controller {

	@Autowired
private Operations operations;
	
	

	@PostMapping("")
	public ResponseEntity<Book> addBook(@RequestBody Book book)
	{
		return new ResponseEntity<Book>(operations.saveBook(book), HttpStatus.OK);
		
	}
	@GetMapping("")
	public ResponseEntity<List<Book>> getBook()
	{
		return new ResponseEntity<List<Book>>(operations.getAllBooks(), HttpStatus.OK);
		
	}
	@GetMapping("/{id}")
	public ResponseEntity<Book> fetchBookById(@PathVariable int id)
	{
		return new ResponseEntity<Book>(operations.getBookById(id), HttpStatus.OK);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<String> DeleteBookById(@PathVariable  int id)
	{
		return new ResponseEntity<String>(operations.deleteBookById(id), HttpStatus.OK);
	}
	
}
