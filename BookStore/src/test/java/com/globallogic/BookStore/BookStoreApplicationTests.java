package com.globallogic.BookStore;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;




import com.globallogic.BookStore.Entity.Book;
import com.globallogic.BookStore.Repository.Repo;
import com.globallogic.BookStore.Service.BookService;

@SpringBootTest
class BookStoreApplicationTests {

	    @MockBean
		private Repo repo ;
		
	     @Autowired
	     private BookService bookService;
	     
	     @Test
	      void getBooksTest()
	     {
	    	 when(repo.findAll()).thenReturn(Stream.of(new Book("1","Java","Rajiv","Science",900),
	    			 new Book("2","C++","vishal","Technology",980)).collect(Collectors.toList())
	    			 );
	    	 assertEquals(2, bookService.getBooks().size());
	     }
	     @Test
	      void saveEmployee()
	     {
	    	 Book book=new Book("2","C++","vishal","Technology",980);
	    	 when(repo.save(book)).thenReturn(book);
	    	 assertEquals(book,bookService.saveBook(book));
	     }
	     
}
