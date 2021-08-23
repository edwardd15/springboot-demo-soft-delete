package com.kelaskoding.service;

import com.kelaskoding.entity.Books;
import com.kelaskoding.repo.BookRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    
    @Autowired
    private BookRepo repo;

    public Books create(Books books){
        return repo.save(books);
    }

    public void remove(Long id){
        repo.deleteById(id);
    }

    public Iterable<Books> findAll(){
        return repo.findAll();
    }
}
