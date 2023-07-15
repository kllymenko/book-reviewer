package ua.klymenko.bookreviewer.repository;

import org.springframework.data.repository.CrudRepository;
import ua.klymenko.bookreviewer.entity.Book;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Long> {
    Book findByBookName(String bookName);
    List<Book> findAll();
}
