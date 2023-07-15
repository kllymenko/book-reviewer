package ua.klymenko.bookreviewer.repository;

import org.springframework.data.repository.CrudRepository;
import ua.klymenko.bookreviewer.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {
}
