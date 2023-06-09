package com.Problem2.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book")
public class Book{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookId;
    private String name;
    private String author;
    private String publication;
    private String category;
    private int pages;
    private int price;
    private Timestamp created_timestamp;
    
	public Book() {
		
	}

	public Book(int bookId, String name, String author, String publication, String category, int pages,
			int price, Timestamp created_timestamp) {
		super();
		this.bookId = bookId;
		this.name = name;
		this.author = author;
		this.publication = publication;
		this.category = category;
		this.pages = pages;
		this.price = price;
		this.created_timestamp = created_timestamp;
	}

	public Book(String name, String author, String publication, String category, int pages, int price,
			Timestamp created_timestamp) {
		super();
		this.name = name;
		this.author = author;
		this.publication = publication;
		this.category = category;
		this.pages = pages;
		this.price = price;
		this.created_timestamp = created_timestamp;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublication() {
		return publication;
	}

	public void setPublication(String publication) {
		this.publication = publication;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Timestamp getCreated_timestamp() {
		return created_timestamp;
	}

	public void setCreated_timestamp(Timestamp created_timestamp) {
		this.created_timestamp = created_timestamp;
	}

	@Override
	public String toString() {
		return "BookLibraryImpl [bookId=" + bookId + ", name=" + name + ", author=" + author + ", publication="
				+ publication + ", category=" + category + ", pages=" + pages + ", price=" + price
				+ ", created_timestamp=" + created_timestamp + "]";
	}
    
    
  
}
