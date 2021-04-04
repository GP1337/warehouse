package com.warehouse.controller;

import com.warehouse.domain.dto.ProductDto;
import com.warehouse.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public ResponseEntity<List<ProductDto>> getAll(){
        return new ResponseEntity(productService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductDto> getById(@PathVariable("id") int id){
        return new ResponseEntity(productService.getById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<ProductDto> add(@RequestBody ProductDto body){
        return new ResponseEntity(productService.add(body), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProductDto> update(@PathVariable("id") int id, @RequestBody ProductDto body){
        return new ResponseEntity(productService.update(id, body), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable("id") int id){

        productService.delete(id);
        return new ResponseEntity(HttpStatus.OK);

    }

}
