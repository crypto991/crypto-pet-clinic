package crypto.world.demo.repositories;

import crypto.world.demo.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Vet, Long> {
}
