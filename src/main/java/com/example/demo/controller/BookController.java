package com.example.demo.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;
import com.example.demo.service.BookService;


@RestController
public class BookController {
	@Autowired
	BookService bookService;
	@GetMapping("/BookName")
	private List<Book> getAllUser()   
	{  
	return bookService.getAllUser();
	
	}
	
	@GetMapping("/Author")
	private List<String> getAllAuthor()   
	
	{  
		return bookService.getAllAuthor();
	


}
}
