package com.example.bookshop.controllers;

import com.example.bookshop.entities.Book;
import com.example.bookshop.repositories.BookRepositoryImpl;
import com.example.bookshop.services.BookService;
import com.example.bookshop.services.BookServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/book/create")
public class CreateBookController extends HttpServlet {
    private final BookService bookService = new BookServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        bookService.createBook(getBook(req));

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/pages/book/list_books.jsp");
        req.setAttribute("books", BookRepositoryImpl.getBooks());
        requestDispatcher.forward(req, resp);

    }

    private static Book getBook(HttpServletRequest req) {
        String author = req.getParameter("author");
        String title = req.getParameter("title");
        int cost = Integer.parseInt(req.getParameter("cost"));

        return new Book(author, title, cost);
    }
}
