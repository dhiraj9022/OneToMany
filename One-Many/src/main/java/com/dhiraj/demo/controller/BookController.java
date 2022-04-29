package com.dhiraj.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dhiraj.demo.entity.Book;
import com.dhiraj.demo.entity.Library;
import com.dhiraj.demo.service.BookService;
import com.dhiraj.demo.service.LibraryService;

@RestController
public class BookController {

	@Autowired
	private BookService bookService;
	

	@PostMapping("/books")
	public Book saveBook(@RequestBody Book book)
	{
		//System.out.println(bookService.getBooks());
		return bookService.createBook(book);
	}
	
	@GetMapping("/books")
	public List<Book> getBooks(@RequestBody Book book)
	{
		return bookService.getBooks();
	}
	
}
