package guru.springframework.sfgpetclinic.bootstrap;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.OwnerService;
import guru.springframework.sfgpetclinic.services.VetService;
import guru.springframework.sfgpetclinic.services.map.OwnerServiceMap;
import guru.springframework.sfgpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService verService;
    public DataLoader() {
        ownerService = new OwnerServiceMap();
        verService = new VetServiceMap();
    }

    @Override
    public void run(String... args){

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Haritha");
        owner1.setLastName("Subramanyamreddy");

        ownerService.save(owner1);


        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Bindu");
        owner2.setLastName("Madhavi");

        ownerService.save(owner2);
        System.out.println("Loaded Owners.......");


        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Chandra");
        vet1.setLastName("Reddy");

        verService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(1L);
        vet2.setFirstName("Chandra");
        vet2.setLastName("Reddy");

        verService.save(vet2);
        System.out.println("Loaded Vets......");
    }
}
