package com.api.library.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.api.library.model.Book;

@Repository
public interface BookDao extends JpaRepository<Book, Long> {

    @SuppressWarnings("null")
    public List<Book> findAll();

    @Query("SELECT b FROM Book b WHERE b.author = :author") //consulta usando JPA
    public Book findBookByAuthor(String author);

    @SuppressWarnings({ "null", "unchecked" })
    public Book save(Book book);

}