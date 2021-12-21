package com.example.springdatajpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "book_id")
    private long bookId;
    @Column(name = "isbn")
    private String isbn;
    @Column(name = "title")
    private String title;
    @ManyToOne
    private Author author;
    @ManyToOne
    @JoinColumn(name = "publication_id")
    private Publication publications;

    public Book() {
        super();
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Publication getPublications() {
        return publications;
    }

    public void setPublications(Publication publications) {
        this.publications = publications;
    }

}
