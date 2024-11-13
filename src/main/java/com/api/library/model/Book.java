package com.api.library.model;

import java.time.Year;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "book") //table name
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String author;
    private String title;
    private String synopsis;
    private Year year;

    @Override
    public String toString() {
        return "Book{" +
               "id=" + id +
               ", author='" + author + '\'' +
               ", title='" + title + '\'' +
               ", synopsis='" + synopsis + '\'' +
               ", year=" + year +
               '}';
    }

}
