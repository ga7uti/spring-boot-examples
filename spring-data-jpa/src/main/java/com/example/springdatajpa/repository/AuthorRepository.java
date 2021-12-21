package com.example.springdatajpa.repository;

import com.example.springdatajpa.entity.Author;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends CrudRepository<Author,Long> {
    
}
