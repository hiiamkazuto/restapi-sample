package com.example.restapisample.repository;

import com.example.restapisample.bean.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookRepository {

    private static final List<Book> bookList = List.of(
            new Book(1, 1, "Harry Potter and the Philosophers Stone", 223),
            new Book(2, 2, "Moby Dick", 635),
            new Book(3, 3, "Interview with the vampire", 731)
    );

    public List<Book> findAll() {
        return bookList;
    }

    public Book findById(long id) {
        return bookList.stream()
                .filter(s -> s.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
