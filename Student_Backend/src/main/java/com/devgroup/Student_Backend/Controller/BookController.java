package com.devgroup.Student_Backend.Controller;

import com.devgroup.Student_Backend.Model.Book;
import com.devgroup.Student_Backend.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {

    @Autowired
    private BookService bookService ;

    @PostMapping("/Bookdata/{id}")
    public String saveDataBook(@RequestBody Book book , @PathVariable Long id){
        String response = bookService.saveDate(book ,id);
        return  response ;
    }
}
