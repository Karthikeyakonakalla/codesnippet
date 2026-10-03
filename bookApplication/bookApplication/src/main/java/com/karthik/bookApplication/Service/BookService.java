package com.karthik.bookApplication.Service;

import com.karthik.bookApplication.Entity.Book;
import com.karthik.bookApplication.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public Book addBook(Book book) {
      Book savedBook =  bookRepository.save(book);
      return savedBook;
    }


    public Book getBookByName(String name) {
        return bookRepository.findBookByTitle(name);
    }

    public Book updateBook(Book book) {
        Book updatedBook= bookRepository.save(book);
        return updatedBook;
    }

    public void deleteBook(Integer id) {
        bookRepository.deleteById(id);
    }
}
