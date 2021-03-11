package com.cg.mypackage.entities;

import javax.persistence.*;

@Table(name = "book")
@Entity
public class Book {
	@GeneratedValue
	@Id
	private long ISBN;
	private String title;
	private float price;

	public Book() {

	}

	public Book(long iSBN, String title, float price) {

		this.ISBN = iSBN;
		this.title = title;
		this.price = price;
	}

	public long getISBN() {
		return ISBN;
	}

	public void setISBN(long iSBN) {
		ISBN = iSBN;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}
