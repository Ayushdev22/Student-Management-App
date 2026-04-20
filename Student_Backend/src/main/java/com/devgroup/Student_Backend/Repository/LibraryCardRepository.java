package com.devgroup.Student_Backend.Repository;

import com.devgroup.Student_Backend.Model.LibraryCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryCardRepository extends JpaRepository<LibraryCard ,Long> {

}
