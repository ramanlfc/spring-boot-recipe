package guru.springframework.repository;

import guru.springframework.model.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface IRecipeRepository extends CrudRepository<Recipe,Long> {
}
