package com.example.bookshop.controllers;

import com.example.bookshop.entities.Book;
import com.example.bookshop.repositories.BookRepositoryImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/book/select")
public class SelectBookController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Book> books = BookRepositoryImpl.getBooks();

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/pages/book/list_books.jsp");
        req.setAttribute("books", books);
        requestDispatcher.forward(req, resp);
    }
}
