package com.myapp.spring.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.myapp.spring.model.Book;

@Repository
public interface IBookAccess extends MongoRepository<Book, Integer>{
	
	

}
