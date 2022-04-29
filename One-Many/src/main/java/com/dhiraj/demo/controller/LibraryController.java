package com.dhiraj.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dhiraj.demo.entity.Library;
import com.dhiraj.demo.service.LibraryService;

@RestController
public class LibraryController {

	@Autowired
	private LibraryService libraryService;
	
	@PostMapping("/libraries")
	public Library saveLibraries(@RequestBody Library library)
	{
		return libraryService.createLibrary(library);
	}
	
	@RequestMapping("/libraries/{id}")
	public void updateLibrary(@RequestBody Library library, @PathVariable long id)
	{
		 libraryService.updateLibrary(library, id);
	}
	
	@GetMapping("/libraries")
	public List<Library> getLibraries(@RequestBody Library library)
	{
		return libraryService.getLibraries();
	}
	
	@GetMapping("/libraries/{id}")
	public void getByIdLibrary(@PathVariable long id)
	{
		 libraryService.getByIdLibrary(id);
	}
	
	@DeleteMapping("/libraries/{id}")
	public void delByIdLibrary(@PathVariable long id)
	{
		 libraryService.delByIdLibrary(id);
	}
	
	@DeleteMapping("/libraries")
	public void delAllLibrary()
	{
		 libraryService.delAllLibrary();
	}
	
}
