package com.example.springdatajpa.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Publication {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "publication_id")
    private long publicationId;
    @Column(name = "name")
    private String name;
    @OneToMany(mappedBy = "publication")
    private Set<Book> books;

    public Publication() {
        super();
    }

    public long getPublicationId() {
        return publicationId;
    }

    public void setPublicationId(long publicationId) {
        this.publicationId = publicationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}
