package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;

@Service
@Transactional
public class BookService {
	
	@Autowired
	BookRepository bookRepository;

	public List<Book> getAllUser() {
		List<Book> book = null;
	return book=bookRepository.findAll();
	
	}
	public List<String> getAllAuthor()
	{
		
		return bookRepository.getAllAuthor();
	}
}
