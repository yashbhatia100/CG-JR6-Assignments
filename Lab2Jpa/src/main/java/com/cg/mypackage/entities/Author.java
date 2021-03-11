package com.cg.mypackage.entities;

import javax.persistence.*;
import java.util.*;

@Table(name = "author")
@Entity
public class Author {
	@GeneratedValue
	@Id
	private int id;
	private String name;
	@OneToMany()
	private Set<Book> book;

	public Author() {

	}

	public Author(String name, Set<Book> book) {
		this.name = name;
		this.book = book;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Book> getBook() {
		return book;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setBook(Set<Book> book) {
		this.book = book;
	}

}
