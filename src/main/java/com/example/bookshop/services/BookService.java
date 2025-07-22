package com.example.bookshop.services;

import com.example.bookshop.entities.Book;

public interface BookService {
    void createBook(Book book);
    Book getBook(long id);
}
