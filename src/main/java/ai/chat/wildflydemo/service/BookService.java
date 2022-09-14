package ai.chat.wildflydemo.service;

import java.util.Collection;

import ai.chat.wildflydemo.model.Book;

public interface BookService {
    Collection<Book> getBooks();
    Book addBook(Book book);
}
