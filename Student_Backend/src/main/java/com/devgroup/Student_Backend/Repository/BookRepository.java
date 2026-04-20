package com.devgroup.Student_Backend.Repository;

import com.devgroup.Student_Backend.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book ,Long> {


}
