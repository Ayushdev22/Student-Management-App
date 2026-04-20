package com.devgroup.Student_Backend.Controller;

import com.devgroup.Student_Backend.Dto.StudentDto;
import com.devgroup.Student_Backend.Model.Student;
import com.devgroup.Student_Backend.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@ResponseBody
public class StudentController {


    @Autowired
    private StudentService studentService;

    @PostMapping("/save")
    public  String addData(@RequestBody Student student){
       String response = studentService.saveData(student);
       return response;
    }
    @GetMapping("/student/{rollNo}")
    public Student getStudent(@PathVariable Long rollNo) {
        return studentService.getData(rollNo);
    }
    @GetMapping("/studentlist")
    public List<Student> findStudentList(@RequestParam int min , @RequestParam int max){
       return studentService.findStudent(min , max) ;
    }
    @GetMapping("/Listofstudent")
    public  List<Student> findAllList(){
        List<Student> studentList = studentService.findAllStudent();
        return studentList;
    }

   // ------ dto controller --------

   @GetMapping("/dtolist")
   public List<StudentDto> findAllDtoStudent(){
        List<StudentDto> studentDtos =studentService.findAllStudentByDto();
        return  studentDtos;
   }

   @GetMapping("/dtostudent/{rollNo}")
    public StudentDto findstudent(@PathVariable Long rollNo){
       StudentDto studentDto =  studentService.findStudentByid(rollNo);

       return studentDto ;
   }
}
