package com.jacoblindev.wildflydemo.service;

import java.util.Collection;

import com.jacoblindev.wildflydemo.model.Book;

public interface BookService {
    Collection<Book> getBooks();
    Book addBook(Book book);
}
