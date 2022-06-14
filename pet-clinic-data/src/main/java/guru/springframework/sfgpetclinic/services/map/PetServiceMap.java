package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Pet;
import guru.springframework.sfgpetclinic.services.CrudService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {


    @Override
    public Set<Pet> findAll() {
        return this.findAll();
    }

    @Override
    public void deleteById(Long id) {
        this.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        this.delete(object);
    }

    @Override
    public Pet save(Pet object) {
        return this.save(object.getId(), object);
    }

    @Override
    public Pet findById(Long id) {
        return this.findByID(id);
    }
}
