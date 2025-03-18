package com.book_manager.services;

import com.book_manager.dto.BookDto;
import com.book_manager.model.Book;

import java.util.List;

public interface BookService {

    Book createBook(BookDto request);
    List<Book> getBooks();
}
