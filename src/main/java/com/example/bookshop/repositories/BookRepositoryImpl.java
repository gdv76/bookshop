package com.example.bookshop.repositories;

import com.example.bookshop.entities.Book;

import java.util.ArrayList;
import java.util.List;

public class BookRepositoryImpl implements BookRepository {
    private static final List<Book> books = new ArrayList<>();
    @Override
    public void createBook(Book book) {
        books.add(book);
    }

    public static List<Book> getBooks() {

        return books;
    }

}
