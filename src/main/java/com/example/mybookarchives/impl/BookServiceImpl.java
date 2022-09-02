package com.example.mybookarchives.impl;

import com.example.mybookarchives.model.Book;
import com.example.mybookarchives.model.GoogleBook;
import com.example.mybookarchives.repository.BookRepository;
import com.example.mybookarchives.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<GoogleBook> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public GoogleBook findByTitle(String title) {
        return bookRepository.findByTitle(title);
    }

    @Override
    public List<GoogleBook> findAllByAuthor(String author) {
        return bookRepository.findAllByAuthor(author);
    }

//    @Override
//    public Book saveOrUpdateBook(Book book) {
//        return bookRepository.save(book);
//    }


    @Override
    public GoogleBook saveOrUpdateGoogleApiBook(GoogleBook book) {
        return bookRepository.save(book);
    }

    @Override
    public void deleteBookByTitle(String title) {
        bookRepository.deleteBookByTitle(title);
    }

    @Override
    public long count() {
        return bookRepository.count();
    }
}