package com.techlabs.model;

public class BookApp {
	private int bookId;
	private String name;
	private String author;
	private int price;
	
	public BookApp()
	{
		bookId=1;
		name="Harry Putter";
		author="Me";
		price=100;
	}
	
	public BookApp(int bookId,String name,String author,int price)
	{
		this.bookId=bookId;
		this.name=name;
		this.author=author;
		this.price=price;
	}
	
	public void setBookId(int bookId)
	{
		this.bookId=bookId;
	}
	public int getBookId()
	{
		return bookId;
	}
	
	public void setPrice(int price)
	{
		this.price=price;
	}
	public int getPrice()
	{
		return price;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setAuthor(String author)
	{
		this.author=author;
	}
	public String getAuthor()
	{
		return author;
	}
	
	
	
}
