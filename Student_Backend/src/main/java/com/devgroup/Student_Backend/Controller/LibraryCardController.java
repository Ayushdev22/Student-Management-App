package com.devgroup.Student_Backend.Controller;

import com.devgroup.Student_Backend.Model.LibraryCard;
import com.devgroup.Student_Backend.Service.LibraryCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@ResponseBody
public class LibraryCardController {

    @Autowired
    private LibraryCardService libraryCardService;

   @PostMapping("/LibraryData/{rollNo}")
    public String saveLibraryCard(@RequestBody LibraryCard libraryCard ,@PathVariable Long rollNo){

       String response = libraryCardService.saveData(libraryCard,rollNo);
       return response;
   }
}
