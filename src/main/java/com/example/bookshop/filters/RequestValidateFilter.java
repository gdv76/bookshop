package com.example.bookshop.filters;

import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

@WebFilter(urlPatterns = "/book/create")
public class RequestValidateFilter extends HttpFilter {
    @Override
    public void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {

        String bookCost = req.getParameter("cost");
        try {
            Integer cost = Integer.parseInt(bookCost);
        } catch (NumberFormatException ex) {
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("/pages/book/validate_error.jsp");
            requestDispatcher.forward(req, res);
        }
        chain.doFilter(req, res);
    }
}
