package com.example.mybookarchives.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("books")
public class Book {

    @Id
    private String id;

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public String getReview() {
        return review;
    }

    private String title;
    private String author;
    private String genre;
    private String review;


    public Book(String id, String title, String author, String genre, String review) {
        super();
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.review = review;
    }
}