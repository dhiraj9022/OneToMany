package com.dhiraj.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhiraj.demo.entity.Book;
import com.dhiraj.demo.entity.Library;
import com.dhiraj.demo.repository.BookRepository;
import com.dhiraj.demo.repository.LibraryRepository;

import ch.qos.logback.core.joran.conditional.IfAction;

@Service
public class LibraryService {

	@Autowired
	private LibraryRepository libraryRepository;
	
	
	
	public Library createLibrary(Library library)
	{
		return libraryRepository.save(library);
	}
	

	public List<Library> getLibraries()
	{
		List<Library> libraries= new ArrayList<>();
		libraryRepository.findAll().forEach(lib -> libraries.add(lib));
		return libraries;
	}
	
	public void updateLibrary(Library library, long id)
	{
		Library lib= new Library();
		lib=libraryRepository.findById(id).get();
		lib.setName(library.getName());
		libraryRepository.save(library);
	}
	
	public void getByIdLibrary(long id)
	{
		 libraryRepository.findById(id);
	}
	
	public void delByIdLibrary(long id)
	{
		 libraryRepository.deleteById(id);
	}
	
	public void delAllLibrary()
	{
		 libraryRepository.deleteAll();
	}
}
