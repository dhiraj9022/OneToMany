package com.dhiraj.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhiraj.demo.entity.Book;
import com.dhiraj.demo.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;
	
	public Book createBook(Book book)
	{
		return bookRepository.save(book);
	}
	
	public List<Book> getBooks()
	{
		List<Book> books= new ArrayList<>();
		bookRepository.findAll().forEach(lib -> books.add(lib));
		return books;
	}
	
}
