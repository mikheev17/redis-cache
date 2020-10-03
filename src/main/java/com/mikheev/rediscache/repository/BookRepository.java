package com.mikheev.rediscache.repository;

import com.mikheev.rediscache.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}