package br.com.klayton.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.klayton.model.Book;

public interface BookRepository extends JpaRepository<Book, Long>{}