package crypto.world.demo.repositories;

import crypto.world.demo.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
