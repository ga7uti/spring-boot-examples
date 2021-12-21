package com.example.springdatajpa.repository;

import com.example.springdatajpa.entity.Book;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book,Long> {
    
}
