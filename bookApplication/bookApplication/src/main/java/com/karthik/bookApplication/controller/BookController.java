package com.karthik.bookApplication.controller;

import com.karthik.bookApplication.Entity.Book;
import com.karthik.bookApplication.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book/v1/")
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }


    @PostMapping("/addBook")
    public ResponseEntity<Book> addBook(@RequestBody Book book){
    Book savedBook= bookService.addBook(book);
    return ResponseEntity.ok(savedBook);
    }

    @GetMapping("/getBook/{name}")
    public ResponseEntity<Book> getBookByName(@PathVariable String name){
        return ResponseEntity.ok(bookService.getBookByName(name));

    }

    @PutMapping("/updateBook")
    public ResponseEntity<Book> updateBook(@RequestBody Book book){
        Book updatedBook=bookService.updateBook(book);
        return ResponseEntity.ok(updatedBook);
    }

    @DeleteMapping("/deleteBook/{id}")
    public ResponseEntity<Book> deleteBook(@PathVariable Integer id){
        bookService.deleteBook(id);
        return ResponseEntity.ok().build();
    }

}
