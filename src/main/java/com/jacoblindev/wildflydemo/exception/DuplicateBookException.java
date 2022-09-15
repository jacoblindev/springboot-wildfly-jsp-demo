package com.jacoblindev.wildflydemo.exception;

import com.jacoblindev.wildflydemo.model.Book;

import lombok.Getter;

@Getter
public class DuplicateBookException extends RuntimeException {
    private final Book book;

    public DuplicateBookException(Book book) {
        this.book = book;
    }
}
