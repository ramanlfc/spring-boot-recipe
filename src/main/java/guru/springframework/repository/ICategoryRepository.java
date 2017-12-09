package guru.springframework.repository;

import guru.springframework.model.Category;
import guru.springframework.model.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ICategoryRepository extends CrudRepository<Category, Long> {
    Optional<Category> findByDescription(String description);
}
