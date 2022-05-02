package com.testjunit.libraryapi.resource;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.testjunit.libraryapi.dto.BookDTO;
import com.testjunit.libraryapi.model.entity.Book;
import com.testjunit.libraryapi.service.BookService;

@RestController
@RequestMapping("/api/books")
public class BookController {

	@Autowired
	private BookService service;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public BookDTO create(@RequestBody BookDTO dto) {
		Book entity = modelMapper.map(dto, Book.class);
		
		entity = service.save(entity);
		
		return modelMapper.map(entity, BookDTO.class);
	}
}
