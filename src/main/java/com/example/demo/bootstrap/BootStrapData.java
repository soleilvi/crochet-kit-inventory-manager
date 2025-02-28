package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        // PARTS SECTION
        if (outsourcedPartRepository.count() == 0) {
            InhousePart hook= new InhousePart("Hook", 0.99, 100,
                                        100 ,500, 1);
            OutsourcedPart yarn= new OutsourcedPart("Paintbox", "Yarn", 0.50,
                                                600, 300, 1500, 3);
            OutsourcedPart plasticEyes= new OutsourcedPart("Incraftables", "Plastic eyes", 0.10,
                                                        880, 200, 1000, 2);
            OutsourcedPart needle= new OutsourcedPart("Sewem", "Needle", 0.50,
                                                  450, 100 ,500, 1);
            InhousePart pattern= new InhousePart("Pattern", 0.20, 100,
                                            100 ,500, 1);

            partRepository.save(hook);
            partRepository.save(yarn);
            partRepository.save(plasticEyes);
            partRepository.save(needle);
            partRepository.save(pattern);
        }

        // PRODUCTS SECTION
        if (productRepository.count() == 0) {
            Product catKit= new Product("Cat kit",10.99,47);
            Product dogKit= new Product("Dog kit",10.99,51);
            Product frogKit= new Product("Frog kit",10.99,44);
            Product penguinKit= new Product("Penguin kit",10.99,48);
            Product bunnyKit= new Product("Bunny kit",10.99,41);

            productRepository.save(catKit);
            productRepository.save(dogKit);
            productRepository.save(frogKit);
            productRepository.save(penguinKit);
            productRepository.save(bunnyKit);
        }

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products: " + productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts: " + partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
