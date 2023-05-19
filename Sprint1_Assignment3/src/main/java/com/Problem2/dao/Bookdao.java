package com.Problem2.dao;

import com.Problem2.model.Book;

public interface Bookdao {

	Book findBookById(int id);
	String saveBook(Book book);
	String deleteBookById(int id);
	String updateBookPrice(int id);
}
