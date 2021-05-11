package com.example.restapisample.bean;

import lombok.Value;

@Value
public class Book {
    long id;
    long authorId;
    String name;
    int pageCount;
}
