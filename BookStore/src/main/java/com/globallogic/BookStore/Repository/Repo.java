package com.globallogic.BookStore.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.BookStore.Entity.Book;

public interface Repo extends JpaRepository<Book, String>{

}
