package com.karthik.bookApplication.Service;

import com.karthik.bookApplication.Entity.Book;
import com.karthik.bookApplication.Repository.BookRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Service;

@Service
public class BookService {


    BookRepository bookRepository;
   // FirstProgrammaticApproach firstProgrammaticApproach;
    //SecondProgrammaticApproach secondProgrammaticApproach;

    public BookService(BookRepository bookRepository
                       //FirstProgrammaticApproach firstProgrammaticApproach,
                       //SecondProgrammaticApproach secondProgrammaticApproach
                       ) {
        this.bookRepository = bookRepository;
       // this.firstProgrammaticApproach = firstProgrammaticApproach;
       // this.secondProgrammaticApproach=secondProgrammaticApproach;
    }

    @Transactional(transactionManager = "transactionManager")
    public Book addBook(Book book) {
        //firstProgrammaticApproach.updateUser();
       // secondProgrammaticApproach.updateUser();
      Book savedBook =  bookRepository.save(book);
        System.out.println("hi");
        System.out.println("hi");
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
