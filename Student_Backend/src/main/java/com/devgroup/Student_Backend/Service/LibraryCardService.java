package com.devgroup.Student_Backend.Service;

import com.devgroup.Student_Backend.Model.LibraryCard;
import com.devgroup.Student_Backend.Model.Student;
import com.devgroup.Student_Backend.Repository.LibraryCardRepository;
import com.devgroup.Student_Backend.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibraryCardService {

    @Autowired
    private LibraryCardRepository libraryCardRepository;

    @Autowired
    private StudentRepository studentRepository;

    public String saveData(LibraryCard libraryCard, Long rollNo){

        Student student = studentRepository.findByRollNo(rollNo);

        if(student ==null){
          return "Student not found";
        }

        libraryCard.setStudent(student);

        libraryCardRepository.save(libraryCard);

        return "Library Card data saved successfully";
    }


    //    public String saveData(LibraryCard libraryCard){
    //        libraryCardRepository.save(libraryCard);
    //        return "Library Card data save";
    //    }


    //    public LibraryCard findCard(Long id){
    //         LibraryCard libraryCard = libraryCardRepository.findById(id);
    //         return libraryCard ;
    //    }


}
