package com.testjunit.libraryapi.exception;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.validation.BindingResult;

public class ApiErros {

	private List<String> errors;
	
	public ApiErros(BindingResult bindResult) {
		this.errors = new ArrayList<>();
		bindResult.getAllErrors().forEach(error -> this.errors.add(error.getDefaultMessage()));
	}
	
	public ApiErros(BusinessException ex) {
		this.errors = Arrays.asList(ex.getMessage());
	}

	public List<String> getErrors() {
		return errors;
	}
}
