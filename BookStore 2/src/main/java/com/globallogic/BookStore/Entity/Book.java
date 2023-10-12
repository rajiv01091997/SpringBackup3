package com.globallogic.BookStore.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Book")
public class Book {
@Id
private String bookId;
private String title;
private String author;
private String category;
private float price;
public Book() {
	super();
	// TODO Auto-generated constructor stub
}
public Book(String bookId, String title, String author, String category, float price) {
	super();
	this.bookId = bookId;
	this.title = title;
	this.author = author;
	this.category = category;
	this.price = price;
}
public String getBookId() {
	return bookId;
}
public void setBookId(String bookId) {
	this.bookId = bookId;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
@Override
public String toString() {
	return "Book [bookId=" + bookId + ", title=" + title + ", author=" + author + ", category=" + category + ", price="
			+ price + "]";
}



}
