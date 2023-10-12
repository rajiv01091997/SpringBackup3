package com.globallogic.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.globallogic.Entity.Book;
import com.globallogic.Repository.MongoRepo;
//@Component
@Service
public class Operations{
	
@Autowired
private MongoRepo mongoRepo;

public Book saveBook(Book book)
{
	return mongoRepo.save(book);
	
}

public List<Book> getAllBooks()
{
	return mongoRepo.findAll();
	
}

public Book getBookById(int id)
{
	return mongoRepo.findById(id).get();
}

public String deleteBookById(int id)
{
	mongoRepo.deleteById(id);
	return "Book Deleted";
}
}
