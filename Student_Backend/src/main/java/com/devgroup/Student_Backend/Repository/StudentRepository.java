package com.devgroup.Student_Backend.Repository;

import com.devgroup.Student_Backend.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

    Student findByRollNo(Long rollNo);

    List<Student> findByAgeBetween(int minAge ,int maxAge);
}
