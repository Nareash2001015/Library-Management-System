 package com.example.LibraryManagementSystem.repository;

 import com.example.LibraryManagementSystem.entity.Book;
 import org.springframework.data.jpa.repository.JpaRepository;
 import org.springframework.stereotype.Repository;

 //We will only extend the JPA repository and won't need to create a class

 @Repository //Repository
 // that can be used in the DAO layer
public interface BookRepository extends JpaRepository<Book, Long> {

}
