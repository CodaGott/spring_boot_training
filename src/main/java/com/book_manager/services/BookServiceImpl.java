package com.book_manager.services;

import com.book_manager.dto.BookDto;
import com.book_manager.model.Book;
import com.book_manager.repository.BookRepository;
import com.book_manager.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;
    private UserRepository userRepository;

    public BookServiceImpl(BookRepository bookRepository, UserRepository userRepository) {
        this.bookRepository = bookRepository;
        this.userRepository = userRepository;
    }

    @Override
    public Book createBook(BookDto request) {
        var owner = userRepository.findById(request.getOwnerId()).orElseThrow(() -> new RuntimeException("User not found"));

        Book book = new Book();
        book.setAuthor(request.getAuthor());
        book.setTitle(request.getTitle());
        book.setGenre(request.getGenre());
        book.setUser(owner);
        return bookRepository.save(book);
    }

    @Override
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }
}
