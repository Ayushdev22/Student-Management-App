package com.devgroup.Student_Backend.Service;

import com.devgroup.Student_Backend.Model.Book;
import com.devgroup.Student_Backend.Model.LibraryCard;
import com.devgroup.Student_Backend.Repository.BookRepository;
import com.devgroup.Student_Backend.Repository.LibraryCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private LibraryCardRepository libraryCardRepository;

    public String saveDate(Book book , Long id){

        LibraryCard libraryCard = libraryCardRepository.findById(id).orElse(null);

        book.setLibraryCard(libraryCard);

        bookRepository.save(book);

        return  "Book save successfully" ;
    }
}
