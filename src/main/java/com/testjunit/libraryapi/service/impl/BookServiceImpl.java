package com.testjunit.libraryapi.service.impl;

import org.springframework.stereotype.Service;

import com.testjunit.libraryapi.exception.BusinessException;
import com.testjunit.libraryapi.model.entity.Book;
import com.testjunit.libraryapi.model.repository.BookRepository;
import com.testjunit.libraryapi.service.BookService;

@Service
public class BookServiceImpl implements BookService {

	private BookRepository repository;
	
	public BookServiceImpl(BookRepository repository) {
		this.repository = repository;
	}

	@Override
	public Book save(Book book) {
		if(repository.existsByIsbn(book.getIsbn())) {
			throw new BusinessException("Isbn já cadastrado.");
		}
		
		return repository.save(book);
	}

}
