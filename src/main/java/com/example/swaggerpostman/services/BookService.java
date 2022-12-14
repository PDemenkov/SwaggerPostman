package com.example.swaggerpostman.services;

import com.example.swaggerpostman.model.Book;
import com.example.swaggerpostman.model.BookCover;
import com.example.swaggerpostman.repositories.BookRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Collection;

@Service
public class BookService {

    //    private final HashMap<Long, Book> books = new HashMap<>();
//    private long lastId = 0;
    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book createBook(Book book) {
       return bookRepository.save(book);
    }

    public Book findBook(long id) {
        return bookRepository.findById(id).get();
    }

    public Book editBook(Book book) {
        return bookRepository.save(book);
    }

    public void deleteBook(long id) {
        bookRepository.deleteById(id);
    }

    public Collection<Book> getAllBooks() {
        return bookRepository.findAll();
    }

 public Book findByNameIgnoreCase(String name) {
     return bookRepository.findByNameIgnoreCase(name);
 }

    public Collection<Book> findBooksByAuthorContainsIgnoreCase(String author) {
        return bookRepository.findBooksByAuthorContainsIgnoreCase(author);
    }

    public Collection<Book> findAllByNameContainsIgnoreCase(String part) {
        return bookRepository.findAllByNameContainsIgnoreCase(part);
    }
}
