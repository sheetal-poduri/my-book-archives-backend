package com.example.mybookarchives.repository;


import com.example.mybookarchives.model.Book;
import com.example.mybookarchives.model.GoogleBook;
import org.springframework.data.mongodb.repository.DeleteQuery;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface BookRepository extends MongoRepository<GoogleBook, String> {

    @Query("{title:'?0'}")
    GoogleBook findByTitle(String title);

    @Query(value="{author:'?0'}", fields="{'title' : 1, 'author' : 1, 'genre' : 1, 'review': 1}")
    List<GoogleBook> findAllByAuthor(String author);

    @Query(value="{}", fields="{'title' : 1, 'author' : 1, 'genre' : 1, 'review': 1}")
    List<GoogleBook> findAll();

    @DeleteQuery
    void deleteBookByTitle(String title);

    public long count();

}