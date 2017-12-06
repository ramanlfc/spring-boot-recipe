package guru.springframework.repository;

import guru.springframework.model.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

public interface IUnitOfMeasureRepository extends CrudRepository<UnitOfMeasure,Long> {
}
