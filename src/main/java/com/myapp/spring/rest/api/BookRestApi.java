package com.myapp.spring.rest.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.spring.dao.IBookAccess;
import com.myapp.spring.model.Book;

@RestController
@CrossOrigin
public class BookRestApi {
	
	@Autowired
	private IBookAccess bookAccess;
	
	@GetMapping("/books")
	public ResponseEntity<List<Book>> loadAll(){
		return new ResponseEntity<List<Book>>(bookAccess.findAll(),HttpStatus.OK);
	}
	
	@PostMapping("/books")
	public ResponseEntity<String> addBook(@RequestBody Book book){
		bookAccess.save(book);
		return new ResponseEntity<String>("added",HttpStatus.CREATED);
	}

}
