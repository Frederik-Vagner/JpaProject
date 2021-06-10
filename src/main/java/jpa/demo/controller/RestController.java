package jpa.demo.controller;

import jpa.demo.model.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import jpa.demo.repository.ProductRepository;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    ProductRepository productRepository;

    public RestController(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @GetMapping("/products")
    public ResponseEntity<Iterable<Product>> findProdcuts(){
        return ResponseEntity.status(HttpStatus.OK).body(productRepository.findAll());
    }

}
