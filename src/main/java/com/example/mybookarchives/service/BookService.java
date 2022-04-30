package com.example.mybookarchives.service;

import com.example.mybookarchives.model.Book;

import java.util.List;

public interface BookService {

    List<Book> findAll();

    Book findByTitle(String title);

    Book saveOrUpdateBook(Book book);

    void deleteBookByTitle(String id);

    List<Book> findAllByAuthor(String author);

    long count();
}