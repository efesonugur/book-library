package com.efesonugur.library.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.efesonugur.library.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> { }
