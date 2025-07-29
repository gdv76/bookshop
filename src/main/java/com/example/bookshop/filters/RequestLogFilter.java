package com.example.bookshop.filters;

import org.apache.log4j.Logger;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@WebFilter(urlPatterns = "/book/create")
public class RequestLogFilter extends HttpFilter {
    private Logger logger = Logger.getLogger(RequestLogFilter.class);
    @Override
    public void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
        Map<String, ArrayList<String>> headers = getHeaders(req);
        logger.info(req.getRequestURL() + " : " + headers);

        chain.doFilter(req,res);
    }

    private Map<String, ArrayList<String>> getHeaders(HttpServletRequest httpServletRequest) {
        return Collections.list(httpServletRequest.getHeaderNames())
                .stream()
                .collect(Collectors.toMap(
                        Function.identity(),
                        h->Collections.list(httpServletRequest.getHeaders(h))
                ));
    }
}
