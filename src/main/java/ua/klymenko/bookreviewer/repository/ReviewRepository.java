package ua.klymenko.bookreviewer.repository;

import org.springframework.data.repository.CrudRepository;
import ua.klymenko.bookreviewer.entity.Review;

public interface ReviewRepository extends CrudRepository<Review, Long> {
}
