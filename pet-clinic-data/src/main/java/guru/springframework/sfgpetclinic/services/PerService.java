package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface PerService extends CrudRepository<Pet, Long> {

}
