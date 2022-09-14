package ai.chat.wildflydemo.repository;

import java.util.Collection;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import ai.chat.wildflydemo.model.BookData;

@Repository
public interface BookRepository {
    Collection<BookData> findAll();

    Optional<BookData> findById(String isbn);

    BookData add(BookData book);
}
