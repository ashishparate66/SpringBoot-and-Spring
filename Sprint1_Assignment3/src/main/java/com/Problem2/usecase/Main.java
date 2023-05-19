package com.Problem2.usecase;

import java.sql.Timestamp;
import java.util.Scanner;

import com.Problem2.dao.Bookdao;
import com.Problem2.dao.BookdaoImpl;
import com.Problem2.model.Book;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Bookdao methods = new BookdaoImpl();
		
		int choice=0;
		do {
			   System.out.println("Press 1 To add Book ");
	           System.out.println("Press 2 To find Book ");
	       	   System.out.println("Press 3 To delete Book ");
	           System.out.println("Press 4 To update Book Price");
	           System.out.println("Press 0 To exit");
	    	   choice=sc.nextInt();
	    	   switch(choice) {
	    	   case 1:
	    	    System.out.println("Enter Book Name ");
	    	    String bookName =sc.next();
	    	    System.out.println("Enter Author Name");
	    	    String authorName =sc.next();
	    	    System.out.println("Enter Publication name");
	    	    String  publication =sc.next();
	    	    System.out.println("Enter Category");
	    	    String  category =sc.next();
	    	    System.out.println("Enter Number of pages");
	    	    int pages =sc.nextInt();
	    	    System.out.println("Enter Price");
	    	    int price =sc.nextInt();
	    	    Book b = new Book();
	    	    b.setName(bookName);
	    	    b.setAuthor(authorName);
	    	    b.setPublication(publication);
	    	    b.setCategory(category);
	    	    b.setPages(pages);
	    	    b.setPrice(price);
	    	    b.setCreated_timestamp(new Timestamp(System.currentTimeMillis()));
	    	    String s = methods.saveBook(b);
	        	System.out.println(s);
	    	    break;
	    	   
	    	   case 2:
	    	    System.out.println("Enter Book Id ");
	    	    int id=sc.nextInt();
	    	    Book st = methods.findBookById(id);
	        	System.out.println(st);
	    	    break;
	    	   case 3:
	    	    System.out.println("Enter Book Id ");
	    	    id=sc.nextInt();
	    	    s = methods.deleteBookById(id);
	    	    System.out.println(s);
	    	    break;
	    	   case 4:
	    	    
	    	    System.out.println("Enter Book Id ");
	    	    id=sc.nextInt();
	    	    s = methods.updateBookPrice(id);
	    	    	System.out.println(s);
	    	    break;
	    	   }
	    	   
	    	  }while(choice!=0);
	    	  System.out.println(" * * * Have A GOOD DAY! * * * ");  	
		}	
		
		
	}

