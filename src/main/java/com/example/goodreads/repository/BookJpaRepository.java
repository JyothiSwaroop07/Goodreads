package com.example.goodreads.repository;

import org.springframework.data.jpa.repository.*;
import com.example.goodreads.model.*;
import org.springframework.stereotype.Repository;

@Repository
public interface BookJpaRepository extends JpaRepository<Book, Integer> {

}