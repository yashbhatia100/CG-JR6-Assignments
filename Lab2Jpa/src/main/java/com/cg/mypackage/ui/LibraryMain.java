package com.cg.mypackage.ui;

import com.cg.mypackage.entities.*;

import java.util.*;

import javax.persistence.*;

public class LibraryMain {
	EntityManager entityManager;

	public static void main(String args[]) {
		LibraryMain app = new LibraryMain();
		app.start();
	}

	 public void start() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("training-ms");
		entityManager = emf.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		Book Book1 = new Book(12345, "RD Sharma IX", 400);
		entityManager.persist(Book1);
		Book Book2 = new Book(12346, "RD Sharma X", 500);
		entityManager.persist(Book2);

		Set<Book> MathBooks = new HashSet<>();
		MathBooks.add(Book1);
		MathBooks.add(Book2);

		Author MathAuthor = new Author("RD Sharma", MathBooks);
		entityManager.persist(MathAuthor);

		Book book3 = new Book(12347, "The Alchemist", 600);
		entityManager.persist(book3);

		Set<Book> Fiction = new HashSet<>();
		Fiction.add(book3);

		Author fictionAuthor = new Author("Paulo Coelho", Fiction);
		entityManager.persist(fictionAuthor);

		
		transaction.commit();


	}
}