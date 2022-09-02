package com.example.mybookarchives.service;

import com.example.mybookarchives.model.Book;
import com.example.mybookarchives.model.GoogleBook;

import java.util.List;

public interface BookService {

    List<GoogleBook> findAll();

    GoogleBook findByTitle(String title);

    //Book saveOrUpdateBook(Book book);

    GoogleBook saveOrUpdateGoogleApiBook(GoogleBook book);

    void deleteBookByTitle(String id);

    List<GoogleBook> findAllByAuthor(String author);

    long count();
}