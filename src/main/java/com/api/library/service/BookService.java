package com.api.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.library.dao.BookDao;
import com.api.library.model.Book;

@Service
public class BookService {

    @Autowired
    private BookDao bookDao;

    public List<Book> getAllBooks(){
        return bookDao.findAll();
    }

    public Book findBookByAuthor(String author){
        return bookDao.findBookByAuthor(author);
    }

    public Book saveBook(Book book){
        return bookDao.save(book);
    }
    
}
