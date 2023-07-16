package ua.klymenko.bookreviewer.repository;

import org.springframework.data.repository.CrudRepository;
import ua.klymenko.bookreviewer.entity.Book;
import ua.klymenko.bookreviewer.entity.Review;

import java.util.List;

public interface ReviewRepository extends CrudRepository<Review, Long> {
    List<Review> findAll();
}
