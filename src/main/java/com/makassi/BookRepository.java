package com.makassi;

import java.util.List;
import java.util.Optional;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class BookRepository {
    List<Book> getAllBooks() {
        return List.of(
                new Book(1, "Java EE", "A. Goncalves", 2018, "Backend Programming"),
                new Book(2, "Java SE 2", "A. John", 2019, "Java Core"),
                new Book(3, "Java Persistance", "Bryan", 2020, "Hibernate"));
    }

    public int getCountBooks() {
        return this.getAllBooks().size();
    }

    public Optional<Book> getBookById(int id) {
        return this.getAllBooks().stream().filter(book -> book.id == id).findFirst();
    }
}
