package com.example.mybookarchives.controller;

import com.example.mybookarchives.model.Book;
import com.example.mybookarchives.repository.BookRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/books")
public class BookController {

//    @GetMapping("/viewAllBooks")
//    public String index() {
//        return "Greetings from Spring Boot!";
//    }


    private BookRepository bookRepo;

    public BookController(BookRepository bookRepo) {
        this.bookRepo = bookRepo;
    }

    //show all books
    @GetMapping("/getAll")
    public List<Book> getAllBooks(){
        List<Book> books = this.bookRepo.findAll();
        return books;
    }

    // 2. Get book by title
    @GetMapping("/getBookByTitle")
    @ResponseBody
    public Book getBookByTitle(@RequestParam String title) {
        Book book = bookRepo.findItemByTitle(title);
        return book;
    }

    // 3. Get name and quantity of all books by a particular author
    @GetMapping("/getBooksByAuthor")
    @ResponseBody
    public List<Book> getBooksByAuthor(@RequestParam String author) {
        List<Book> books = bookRepo.findAll(author);
        return books;
    }

    // 4. Get count of books in the collection
    @GetMapping("/count")
    public Long findCountOfBooks() {
        return bookRepo.count();
    }

    // DELETE
    @DeleteMapping("deleteBookById/{id}")
    public void deleteBook(String id) {
        bookRepo.deleteById(id);
    }

//    @DeleteMapping("/delete/{bookId}")
//    public void deleteByBookId(@PathVariable("bookId") String bookId){
//        this.bookRepo.deleteById(bookId);
//    }
//
//    @DeleteMapping("/{id}")
//    public void delete(@PathVariable("id") EmpInfo id) {
//        this.employeeRepo.delete(id);
//    }




}
