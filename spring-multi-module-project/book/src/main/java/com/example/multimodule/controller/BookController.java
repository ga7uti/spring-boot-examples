package com.example.multimodule.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.multimodule.entity.Book;

@RestController
@RequestMapping("/books")
public class BookController {

	@GetMapping
	public ResponseEntity<List<Book>> getBooks(){
		List<Book> bookList = new ArrayList<>();
		bookList.add(new Book("Ulysses","James Joyce"));
		bookList.add(new Book("Don Quixote","Miguel de Cervantes"));
		bookList.add(new Book("In Search of Lost Time","Marcel Proust"));
		return ResponseEntity.ok(bookList);
	}
}
