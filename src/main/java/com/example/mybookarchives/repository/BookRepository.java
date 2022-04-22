package com.example.mybookarchives.repository;


import com.example.mybookarchives.model.Book;
import org.springframework.data.mongodb.repository.DeleteQuery;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface BookRepository extends MongoRepository<Book, String> {

    @Query("{title:'?0'}")
    Book findItemByTitle(String title);

    @Query(value="{author:'?0'}", fields="{'title' : 1, 'author' : 1, 'genre' : 1, 'review': 1}")
    List<Book> findAll(String author);

    @DeleteQuery
    void deleteById(String id);

    public long count();

}