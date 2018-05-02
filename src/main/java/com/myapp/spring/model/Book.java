package com.myapp.spring.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Book{
    @Id
	private int id;
	
	private String customerName;
	private String bookName;
	private String bookId;
	private boolean delivered;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(int id, String customerName, String bookName, String bookId, boolean delivered) {
		this.id = id;
		this.customerName = customerName;
		this.bookName = bookName;
		this.bookId = bookId;
		this.delivered = delivered;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public boolean getdelivered() {
		return delivered;
	}

	public void setDelivered(boolean delivered) {
		this.delivered = delivered;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Book [id=");
		builder.append(id);
		builder.append(", customerName=");
		builder.append(customerName);
		builder.append(", bookName=");
		builder.append(bookName);
		builder.append(", bookId=");
		builder.append(bookId);
		builder.append(", delivered=");
		builder.append(delivered);
		builder.append("]");
		return builder.toString();
	}

	
	
	
	
	
	
	
}