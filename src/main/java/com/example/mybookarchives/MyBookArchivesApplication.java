package com.example.mybookarchives;

import com.example.mybookarchives.model.Book;
import com.example.mybookarchives.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.List;

import static com.mongodb.assertions.Assertions.assertFalse;
import static com.mongodb.internal.connection.tlschannel.util.Util.assertTrue;

@SpringBootApplication
@EnableMongoRepositories
public class MyBookArchivesApplication {

	@Autowired
	BookRepository bookRepo;

	public static void main(String[] args) {
		SpringApplication.run(MyBookArchivesApplication.class, args);
	}

	//CREATE
//	void createBooks() {
//		System.out.println("Data creation started...");
//		bookRepo.save(new Book("1", "Harry Potter and the Goblet of Fire", "J.K. Rowling", "Fantasy", "Magical"));
//		bookRepo.save(new Book("2", "Romeo and Juliet", "William Shakespeare", "Romance", "Cliche"));
//		bookRepo.save(new Book("3", "Eragon", "Christopher Paolini", "Fantasy", "Fantastical"));
//		bookRepo.save(new Book("4", "Throne of Glass", "Sarah J. Maas", "Fantasy", "New favorite series"));
//		bookRepo.save(new Book("5", "Harry Potter and the Sorcerer's Stone", "J.K. Rowling", "Fantasy", "Magical"));
//
//		System.out.println("Data creation complete...");
//	}

	// Print details in readable form

//	public String getBookDetails(Book book) {
//
//		System.out.println(
//				"Title: " + book.getTitle() +
//						", \nAuthor: " + book.getAuthor() +
//						", \nGenre: " + book.getGenre() +
//						", \nReview: " + book.getReview()
//
//		);
//		return "";
//	}


//	@Override
//	public void run(String... args) throws Exception {
////
////		System.out.println("-------------CREATE BOOKS-------------------------------\n");
////
////		createBooks();
////
////		System.out.println("\n----------------SHOW ALL BOOKS---------------------------\n");
////
////		showAllBooks();
////
////		System.out.println("\n--------------GET BOOK BY TITLE-----------------------------------\n");
////
////		getBookByTitle("Throne of Glass");
////
////		System.out.println("\n-----------GET BOOKS BY AUTHOR---------------------------------\n");
////
////		getBooksByAuthor("J.K. Rowling");
////
////
////		System.out.println("\n----------DELETE A BOOK----------------------------------\n");
////
////		deleteBook("3");
////
////		System.out.println("\n------------FINAL COUNT OF BOOKS-------------------------\n");
////
////		findCountOfBooks();
////
////		System.out.println("\n-------------------THANK YOU---------------------------");
//
//	}


//	@Bean
//	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
//		return args -> {
//
//			System.out.println("Let's inspect the beans provided by Spring Boot:");
//
//			String[] beanNames = ctx.getBeanDefinitionNames();
//			Arrays.sort(beanNames);
//			for (String beanName : beanNames) {
//				System.out.println(beanName);
//			}
//
//		};
//	}

}
