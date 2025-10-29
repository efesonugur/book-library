package com.efesonugur.library.service;

import com.efesonugur.library.model.Book;
import com.efesonugur.library.repository.BookRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BookService {
    private final BookRepository repo;

    public BookService(BookRepository repo) {
        this.repo = repo;
    }

    public Book create(Book book) {
        return repo.save(book);
    }

    public Book getById(Long id) {
        return repo.findById(id)
                   .orElseThrow(() -> new RuntimeException("Book not found: " + id));
    }

    public List<Book> listAll() {
        return repo.findAll();
    }

    public Book update(Long id, Book updated) {
        Book book = getById(id);
        book.setTitle(updated.getTitle());
        book.setAuthor(updated.getAuthor());
        book.setIsbn(updated.getIsbn());
        book.setPublishedYear(updated.getPublishedYear());
        return repo.save(book);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
