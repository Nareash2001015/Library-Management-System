package com.example.LibraryManagementSystem.service;

import com.example.LibraryManagementSystem.entity.Book;

import java.util.List;
import java.util.Optional;


//An interface is a completely "abstract class"
// that is used to group related methods with empty bodies:
//In this interface we will add the CRUD operations
public interface BookService {

    List<Book> findAllBooks();
    Book createBook(Book book);
    void updateBook(Book book);
    void deleteBook(Long id);
    Optional<Book> findBookByID(Long id); //It may return a null if the id is not valid or not available
}
