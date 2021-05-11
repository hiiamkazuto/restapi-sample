package com.example.restapisample.repository;

import com.example.restapisample.bean.Author;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AuthorRepository {
    private static final List<Author> authorList = List.of(
            new Author(1, "Joanne", "Rowling"),
            new Author(2, "Herman", "Melville")
    );

    public List<Author> findAll() {
        return authorList;
    }

    public Author findById(long id) {
        return authorList.stream()
                .filter(s -> s.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
