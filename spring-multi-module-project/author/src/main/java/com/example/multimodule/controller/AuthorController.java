package com.example.multimodule.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.multimodule.entity.Author;

@RestController
@RequestMapping("/authors")
public class AuthorController {

	@GetMapping
	public ResponseEntity<List<Author>> getAuthors(){
		List<Author> authorList = new ArrayList<>();
		authorList.add(new Author("James Joyce","Ulysses"));
		authorList.add(new Author("Miguel de Cervantes","Don Quixote"));
		authorList.add(new Author("Marcel Proust","In Search of Lost Time"));
		return ResponseEntity.ok(authorList);
	}
}
