package com.shan.Q1;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book list=new Book();
		LinkedHashSet<Book> booksCollection=new LinkedHashSet<>();
		
			booksCollection.add(new Book(1,"Name1","Author1"));
			booksCollection.add(new Book(1,"Name1","Author1"));
			booksCollection.add(new Book(2,"Name2","Author1"));
			booksCollection.add(new Book(3,"Name1","Author1"));
			booksCollection.add(new Book(4,"Name1","Author1"));
			booksCollection.add(new Book(3,"Name1","Author1"));
			booksCollection.add(new Book(5,"Name2","Author1"));
			booksCollection.add(new Book(3,"Name1","Author1"));
			booksCollection.add(new Book(3,"Name1","Author1"));
			booksCollection.add(new Book(3,"Name1","Author1"));
			booksCollection.add(new Book(1,"Name1","Author1"));
			booksCollection.add(new Book(1,"Name1","Author1"));
			booksCollection.add(new Book(2,"Name2","Author1"));
			booksCollection.add(new Book(3,"Name1","Author1"));
			booksCollection.add(new Book(4,"Name1","Author1"));
			booksCollection.add(new Book(3,"Name1","Author1"));
			booksCollection.add(new Book(5,"Name2","Author1"));
			booksCollection.add(new Book(3,"Name1","Author1"));
			booksCollection.add(new Book(3,"Name1","Author1"));
			booksCollection.add(new Book(3,"Name1","Author1"));
			
			
			for(Book books:booksCollection) {
				System.out.println(books);
			}
	}

}
