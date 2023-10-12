package com.globallogic.BookStore.Service;

import java.util.List;

import com.globallogic.BookStore.Entity.Book;

public interface IService {

	Book saveBook(Book book);

	List<Book> getBooks();

	Book getById(String id);

	

	Book updateById(String id, Book book);

	String deleteById(String id);

}
