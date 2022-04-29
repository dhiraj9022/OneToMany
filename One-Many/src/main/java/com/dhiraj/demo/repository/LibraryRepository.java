package com.dhiraj.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.dhiraj.demo.entity.Library;

public interface LibraryRepository extends CrudRepository<Library, Long> {

}
