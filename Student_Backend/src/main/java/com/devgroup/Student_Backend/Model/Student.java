package com.devgroup.Student_Backend.Model;


//import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

@Entity
public class Student {

    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Name", nullable = false)
    private  String name;

    @Column(name = "Roll_No",unique = true,nullable = false)
    private  Long rollNo;

    @Column(name = "Email",unique = true,nullable = false)
    private  String email;

    @Column(name = "Department",nullable = false)
    private  String department;

    @Column(name = "Age",nullable = false)
    private  int age;

    @OneToOne(mappedBy = "student",cascade = CascadeType.ALL)
    //@JsonIgnore
    @JsonManagedReference
    private LibraryCard libraryCard;

    public LibraryCard getLibraryCard() {
        return libraryCard;
    }

    public void setLibraryCard(LibraryCard libraryCard) {
        this.libraryCard = libraryCard;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getRollNo() {
        return rollNo;
    }

    public void setRollNo(Long rollNo) {
        this.rollNo = rollNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
