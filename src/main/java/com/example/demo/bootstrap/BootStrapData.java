package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.InhousePartRepository;
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
    private final InhousePartRepository inhousePartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository, InhousePartRepository inhousePartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
        this.inhousePartRepository = inhousePartRepository;
    }

    @Override
    public void run(String... args) throws Exception {


        //adding Inhouse parts
        inhousePartRepository.deleteAll();
        if (partRepository.count() == 0) {
            InhousePart part1 = new InhousePart();
            part1.setName("Ram");
            part1.setInv(10);
            part1.setPrice(60.0);
            part1.setId(1);
            inhousePartRepository.save(part1);
            InhousePart thePart=null;

            InhousePart part2 = new InhousePart();
            part2.setName("GPU");
            part2.setInv(10);
            part2.setPrice(500.0);
            part2.setId(2);
            inhousePartRepository.save(part2);

            InhousePart part3 = new InhousePart();
            part3.setName("CPU");
            part3.setInv(10);
            part3.setPrice(300.0);
            part3.setId(3);
            inhousePartRepository.save(part3);

            InhousePart part4 = new InhousePart();
            part4.setName("Fan");
            part4.setInv(10);
            part4.setPrice(10.0);
            part4.setId(4);
            inhousePartRepository.save(part4);

            InhousePart part5 = new InhousePart();
            part5.setName("Motherboard");
            part5.setInv(10);
            part5.setPrice(150.0);
            part5.setId(5);
            inhousePartRepository.save(part5);

            List<InhousePart> inhouseParts = (List<InhousePart>) inhousePartRepository.findAll();
            for (InhousePart part : inhouseParts) {
            }

        }



        // Adding products
        productRepository.deleteAll();
        if (productRepository.count() == 0 ) {
            Product Computer1 = new Product("Computer1", 1000.0, 3);
            Product Computer2 = new Product("Computer2", 699.99, 5);
            Product Computer3 = new Product("Computer3", 499.99, 6);
            Product Computer4 = new Product("Computer4", 1500.0, 2);
            Product Computer5 = new Product("Computer5", 2000.0, 1);
            productRepository.save(Computer1);
            productRepository.save(Computer2);
            productRepository.save(Computer3);
            productRepository.save(Computer4);
            productRepository.save(Computer5);
        }


        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
