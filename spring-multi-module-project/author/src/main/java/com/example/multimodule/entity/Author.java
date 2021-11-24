package com.example.multimodule.entity;

public class Author {

	private String name;
	private String book;

	public Author() {
		super();
	}

	public Author(String name, String book) {
		super();
		this.name = name;
		this.book = book;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBook() {
		return book;
	}

	public void setBook(String book) {
		this.book = book;
	}

}
