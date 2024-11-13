package com.api.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.library.model.Author;
import com.api.library.model.Book;
import com.api.library.service.BookService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;



@RestController
@RequestMapping("api")
@Configuration
@CrossOrigin("http://localhost:4321")
public class BookController {
    
    @Autowired
    private BookService bookService;

    @GetMapping("books")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @PostMapping("search")
    public Book findBookByAuthor(@RequestBody Author request) {
        return bookService.findBookByAuthor(request.getAuthor());
    }

    @PostMapping("books")
    public Book saveBook(@RequestBody Book book ){
        System.out.println(book.toString());
        return bookService.saveBook(book);
    }
    
    
}
