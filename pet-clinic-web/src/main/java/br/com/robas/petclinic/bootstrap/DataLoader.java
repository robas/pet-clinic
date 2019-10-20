package br.com.robas.petclinic.bootstrap;

import br.com.robas.petclinic.model.Owner;
import br.com.robas.petclinic.model.Vet;
import br.com.robas.petclinic.services.OwnerService;
import br.com.robas.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("João");
        owner1.setLastName("Silva");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Maria");
        owner2.setLastName("Sousa");

        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Veter");
        vet1.setLastName("Inario");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Anima");
        vet2.setLastName("Lover");

        vetService.save(vet2);

        System.out.println("Loaded Vets...");
    }
}
