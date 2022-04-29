package com.dhiraj.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.dhiraj.demo.entity.Book;
import com.dhiraj.demo.entity.Library;
import com.dhiraj.demo.repository.BookRepository;
import com.dhiraj.demo.repository.LibraryRepository;

@SpringBootApplication
public class OneManyApplication {

	@Autowired 
	private  LibraryRepository libraryRepository;
	
	@Autowired
	private BookRepository bookRepository;
	
	public static void main(String[] args) {
	 ConfigurableApplicationContext context = SpringApplication.run(OneManyApplication.class, args);
	 
	 LibraryRepository library= context.getBean(LibraryRepository.class);
	 
	 BookRepository book= context.getBean(BookRepository.class);
	 
	 Library lib=new Library();
	 lib.setName("Vartak");
	 lib.setId(10);
	 
	 Book book2= new Book();
	 book2.setName("Java");
	 book2.setPrice(1000);
	 book2.setId(10);

	

	 Book book3= new Book();
	 book3.setName("APS.NET");
	 book3.setPrice(2000);
	 book2.setId(20);
	 
	 library.save(lib);
	 book.save(book2);
	 book.save(book3);
	}

}
