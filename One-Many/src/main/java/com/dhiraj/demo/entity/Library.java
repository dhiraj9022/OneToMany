package com.dhiraj.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="library")
public class Library {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
//	
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "book_id", referencedColumnName = "id")
//	private List<Book> books;
	
	
	 @OneToMany(mappedBy = "library", cascade = CascadeType.ALL, targetEntity = Book.class)
	 private List<Book> books;

	public Library()
	{
		
	}
	
	public Library(long id,String name, List<Book> books) {
		this.id=id;
		this.name = name;
		this.books = books;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	

	
}
