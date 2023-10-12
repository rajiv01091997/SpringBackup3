package com.globallogic.BookStore.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.BookStore.Entity.Book;
import com.globallogic.BookStore.Service.BookService;
@RestController
@RequestMapping("api/v1")
public class BookController {
	@Autowired
private BookService bookService;
	@PostMapping("/book")
	public ResponseEntity<Book> saveBook(@RequestBody  Book book)
	{
		return new ResponseEntity<>(bookService.saveBook(book), HttpStatus.OK);
	}
	@GetMapping("/book")
	public ResponseEntity<List<Book>> fetchBooks()
	{
		return new ResponseEntity<>(bookService.getBooks(), HttpStatus.OK);
	}
	@GetMapping("/book/{id}")
	public ResponseEntity<Book> fetchById(@PathVariable   String id)
	{
		return new ResponseEntity<Book>(bookService.getById(id),HttpStatus.OK);
	}
	@PutMapping("/book/{id}")
	public ResponseEntity<Book> updateById(@PathVariable String id,@RequestBody Book book)
	{
		return new ResponseEntity<Book>(bookService.updateById(id,book),HttpStatus.OK);
	}
	@DeleteMapping("/book/{id}")
	public ResponseEntity<String> deleteById(@PathVariable String id)
	{
		return new ResponseEntity<String>(bookService.deleteById(id),HttpStatus.OK);
	}
}
