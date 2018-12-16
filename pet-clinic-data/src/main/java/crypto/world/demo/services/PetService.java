package crypto.world.demo.services;

import crypto.world.demo.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById (Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
