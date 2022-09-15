package com.jacoblindev.wildflydemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookData {
    private String isbn;
    private String name;
    private String author;
}
