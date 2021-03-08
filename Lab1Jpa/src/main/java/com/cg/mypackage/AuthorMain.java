package com.cg.mypackage;

import javax.persistence.*;

public class AuthorMain {
	EntityManager entityManager;

	public static void main(String args[]) {
		AuthorMain app = new AuthorMain();
		app.start();
	}

	void start() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("training-ms");
		entityManager = emf.createEntityManager();
		Author author1 = new Author("Robert", "Envin", "Harvard", "123456");
		add(author1);
		Author author2 = new Author("William", "", "Shakespeare", "654321");
		add(author2);
		display(author1);
		display(author2);
		remove(author2);
		long id = author1.getAuthorId();
		DisplayById(id);
		author1.setPhoneNo("100");
		update(author1);
		entityManager.close();
		emf.close();

	}

	void add(Author author) {
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(author);
		System.out.println("Author is added");
		transaction.commit();

	}

	void update(Author author) {
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		author = entityManager.merge(author);
		System.out.println("Author is Update Or Inserted");
		transaction.commit();
		display(author);
		

	}

	void remove(Author author) {
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.remove(author);
		System.out.println("Author is deleted");

		transaction.commit();

	}

	void DisplayById(long AuthorId) {
		Author author = entityManager.find(Author.class, AuthorId);
		display(author);
	}

	void display(Author author) {
		System.out.println("Author details : " + author.getFirstName() + " " + author.getMiddlename() + " "
				+ author.getLastName() + " " + author.getPhoneNo());

	}
	
}
