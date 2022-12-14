package com.example.swaggerpostman.repositories;

import com.example.swaggerpostman.model.BookCover;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookCoverRepository extends JpaRepository <BookCover,Long>{
    Optional<BookCover> findByBookId(Long bookId);
}
