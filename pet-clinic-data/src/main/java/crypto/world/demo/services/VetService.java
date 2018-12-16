package crypto.world.demo.services;

import crypto.world.demo.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById (Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
