package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.BookApp;
import com.techlabs.model.PlayerApp;

public class BookAppTest {

	public static void displayBooks(BookApp[] books) {
        // Sort books using bubble sort based on average
        for (int i = 0; i < books.length - 1; i++) {
            for (int j = 0; j < books.length - i - 1; j++) {
                if (books[j].getPrice() < books[j + 1].getPrice()) {
                    BookApp temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp;
                }
            }
        }
        // Display sorted books
        for (int i=0;i<books.length;i++) {
            System.out.println("\nBook ID: " + books[i].getBookId());
            System.out.println("Name: " + books[i].getName());
            System.out.println("Author: " + books[i].getAuthor());
            System.out.println("Price: " + books[i].getPrice());
        }
    }
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int no_of_books=scanner.nextInt();
		BookApp books[]= new BookApp[no_of_books];
		
		for(int i=0;i<books.length;i++)
		{
		System.out.println("ENTER BOOK DETAILS, FOR BOOK "+(i+1));
		System.out.println("ENTER ID: ");
		int id= scanner.nextInt();
		System.out.println("ENTER NAME: ");
		String name=scanner.next();
		System.out.println("ENTER AUTHOR: ");
		String author=scanner.next();
		System.out.println("ENTER Price: ");
		int price=scanner.nextInt();

		
		books[i]=new BookApp(id,name,author,price);

	}
		
		System.out.println("\nTHE BOOK DETAILS IN DESCENDING ORDER OF PRICE: \n");
		displayBooks(books);
	}
}
