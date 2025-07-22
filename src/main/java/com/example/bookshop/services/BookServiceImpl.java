package com.example.bookshop.services;

import com.example.bookshop.entities.Book;
import com.example.bookshop.repositories.BookRepository;
import com.example.bookshop.repositories.BookRepositoryImpl;

public class BookServiceImpl implements BookService {
    private final BookRepository userRepository = new BookRepositoryImpl();
    @Override
    public void createBook(Book book) {
        userRepository.createBook(book);
    }

    @Override
    public Book getBook(long id) {
        return null;
    }

}
