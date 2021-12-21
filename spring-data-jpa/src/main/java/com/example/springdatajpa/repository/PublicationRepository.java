package com.example.springdatajpa.repository;

import com.example.springdatajpa.entity.Publication;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublicationRepository extends CrudRepository<Publication,Long>{
    
}
