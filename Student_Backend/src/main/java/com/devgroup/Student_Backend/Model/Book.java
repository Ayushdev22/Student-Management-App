package com.devgroup.Student_Backend.Model;

import com.devgroup.Student_Backend.Enums.Category;
import jakarta.persistence.*;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private  Long id ;

    @Column(name = "title",nullable = false)
    private String title;

    @Column(name = "publisherName",nullable = false)
    private String publisherName;

    @Column(name = "publisherDate",nullable = false)
    private String publisherDate;

    @Column(name = "page",nullable = false)
    private Long page ;

    @Column(name = "available")
    private boolean availability ;

    @Column(name = "rackNo",nullable = false,unique = true)
    private String rackNo;

    @Enumerated(EnumType.STRING)
    private Category category ;

    @ManyToOne
    @JoinColumn(name = "card_id")
    private LibraryCard libraryCard ;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getPublisherDate() {
        return publisherDate;
    }

    public void setPublisherDate(String publisherDate) {
        this.publisherDate = publisherDate;
    }

    public Long getPage() {
        return page;
    }

    public void setPage(Long page) {
        this.page = page;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public String getRackNo() {
        return rackNo;
    }

    public void setRackNo(String rackNo) {
        this.rackNo = rackNo;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public LibraryCard getLibraryCard() {
        return libraryCard;
    }

    public void setLibraryCard(LibraryCard libraryCard) {
        this.libraryCard = libraryCard;
    }
}
