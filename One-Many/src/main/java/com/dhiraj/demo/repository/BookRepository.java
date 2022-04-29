package com.dhiraj.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.dhiraj.demo.entity.Book;

public interface BookRepository  extends CrudRepository<Book, Long> {

}
