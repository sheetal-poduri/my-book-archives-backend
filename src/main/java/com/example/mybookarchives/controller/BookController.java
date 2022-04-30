package com.example.mybookarchives.controller;

import com.example.mybookarchives.model.Book;
import com.example.mybookarchives.repository.BookRepository;
import com.example.mybookarchives.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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


    @Autowired
    private BookService bookService;



    //show all books
    @GetMapping("/getAll")
    public List<Book> getAllBooks(){
        List<Book> books = this.bookService.findAll();
        return books;
    }

    // 2. Get book by title
    @GetMapping("/getBookByTitle")
    @ResponseBody
    public Book getBookByTitle(@RequestParam String title) {
        Book book = bookService.findByTitle(title);
        return book;
    }

    // 3. Get name and quantity of all books by a particular author
    @GetMapping("/getBooksByAuthor")
    @ResponseBody
    public List<Book> getBooksByAuthor(@RequestParam String author) {
        List<Book> books = bookService.findAllByAuthor(author);
        return books;
    }


    // 4. Get count of books in the collection
    @GetMapping("/count")
    public long findCountOfBooks() {
        return bookService.count();
    }

    // DELETE
    @DeleteMapping("deleteBookByTitle/{title}")
    public void deleteBookByTitle(String title) {
        bookService.deleteBookByTitle(title);
    }



    @PostMapping(value = "/save")
    public ResponseEntity<?> saveOrUpdateStudent(@RequestBody Book book) {
        bookService.saveOrUpdateBook(book);
        return new ResponseEntity("Book added successfully", HttpStatus.OK);
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
