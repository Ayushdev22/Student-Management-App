package com.devgroup.Student_Backend.Service;

import com.devgroup.Student_Backend.Dto.StudentDto;
import com.devgroup.Student_Backend.Model.Student;
import com.devgroup.Student_Backend.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;



    public String saveData(Student student){
        studentRepository.save(student);
        return "Student save Sucessfully in DB";
    }

    public Student getData(Long rollNo){
        Student student = studentRepository.findByRollNo(rollNo);

        if(student !=null ){
            return student ;
        }else{
           return null ;
        }
    }

    public List<Student> findStudent(int min , int max){
       List<Student> studentList = studentRepository.findByAgeBetween(min,max);
       return studentList;
    }

    public List<Student> findAllStudent(){
        List<Student> studentist = studentRepository.findAll();
        return studentist;
    }

    // -------Dto method used in service ------

    public List<StudentDto> findAllStudentByDto(){
        List<Student> studentList = studentRepository.findAll(); // entity list  db se aati hai

        ArrayList<StudentDto> dtoList = new ArrayList<>(); // create list class

        for(Student student : studentList){  // entity list pe loop lagaye

            StudentDto dto = new StudentDto(); // student dto ka object banaye

            dto.setName(student.getName());  //   data copy kr ke add kiye
            dto.setRollNo(student.getRollNo());
            dto.setDepartment(student.getDepartment());

            dtoList.add(dto); // fir list mai add kiye
        }

        return dtoList; // list ko return kiye
    }

    
    public StudentDto findStudentByid(Long rollNo){

        Student student = studentRepository.findByRollNo(rollNo);

        StudentDto dto = new StudentDto();

        dto.setRollNo(student.getRollNo());
        dto.setName(student.getName());
        dto.setDepartment(student.getDepartment());

        return dto ;
    }
}
