package com.globallogic.BookStore.Service;

import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globallogic.BookStore.Entity.Book;
import com.globallogic.BookStore.Repository.Repo;
import com.globallogic.BookStore.exceptions.BookNotFoundException;
@Service
public class BookService implements IService {
     @Autowired
	private Repo repo;
     
     private static final Logger logger = LoggerFactory.getLogger(BookService.class);
     
	@Override
     public Book saveBook(Book book)
     {logger.info("Saving Book to database");
		
    	return repo.save(book); 
     }
     @Override
     public List<Book> getBooks()
     { logger.info("fetching all Books");
    	 return repo.findAll();
     }
     @Override
     public Book getById(String id)
     {logger.info("fetching book based on bookid "+id);
     if(repo.findById(id).isEmpty())
         throw new BookNotFoundException("No Book with this id is present");
    	 return repo.findById(id).get();
     }
     @Override
     public Book updateById(String id, Book book)
     {
    	 logger.info("updating book with id " + id);
    	 Book book1=repo.findById(id).get();
    	 book1.setTitle(book.getTitle());
    	 book1.setAuthor(book.getAuthor());
    	 book1.setCategory(book.getCategory());
    	 book1.setPrice(book.getPrice());
    	 return repo.save(book1);
    	 
     }
     @Override
     public String deleteById(String id)
     {logger.info("Deleting Book with ID " + id);
     if(repo.findById(id).isEmpty())
        throw new BookNotFoundException("No Book to delete with this id is present");
    	 repo.deleteById(id);
    	 return "deleted successfully";
     }
}
