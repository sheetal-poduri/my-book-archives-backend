package com.example.mybookarchives.controller;

import com.example.mybookarchives.model.Book;
import com.example.mybookarchives.model.GoogleBook;
import com.example.mybookarchives.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public List<GoogleBook> getAllBooks(){
        List<GoogleBook> books = this.bookService.findAll();
        return books;
    }

    // 2. Get book by title
    @GetMapping("/getBookByTitle")
    @ResponseBody
    public GoogleBook getBookByTitle(@RequestParam String title) {
        GoogleBook book = bookService.findByTitle(title);
        return book;
    }

    // 3. Get name and quantity of all books by a particular author
    @GetMapping("/getBooksByAuthor")
    @ResponseBody
    public List<GoogleBook> getBooksByAuthor(@RequestParam String author) {
        List<GoogleBook> books = bookService.findAllByAuthor(author);
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


    @GetMapping("/getBookByTitleGoogleApi")
    @ResponseBody
    public GoogleBook getBookByTitleGoogleApi(@RequestParam String title) {
        GoogleBook book = bookService.findByTitle(title);
        return book;
    }



//    @PostMapping(value = "/save")
//    public Book saveOrUpdateBook(@RequestBody Book book) {
//        return bookService.saveOrUpdateBook(book);
//    }

    @PostMapping(value = "/saveGoogleApiBook")
    public GoogleBook saveOrUpdateGoogleApiBook(@RequestBody GoogleBook book) {
        return bookService.saveOrUpdateGoogleApiBook(book);
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
