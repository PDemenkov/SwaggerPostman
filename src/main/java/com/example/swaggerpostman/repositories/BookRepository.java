package com.example.swaggerpostman.repositories;

import com.example.swaggerpostman.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface BookRepository  extends JpaRepository<Book,Long> {
    Book findByNameIgnoreCase(String name);

    Collection<Book> findBooksByAuthorContainsIgnoreCase(String author);

    Collection<Book> findAllByNameContainsIgnoreCase(String part);

    Collection<Book> findBooksByNameIgnoreCaseAndAuthor(String name, String author);

    Collection<Book> findBooksByNameOrAuthorAndIdGreaterThan(String name, String author,Long number);

}
