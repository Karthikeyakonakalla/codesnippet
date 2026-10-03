package com.karthik.bookApplication.Repository;

import com.karthik.bookApplication.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {

   // public Book getBookByTitle(String title);


    Book findBookByTitle(String name);
}
