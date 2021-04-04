package com.warehouse.service;

import com.warehouse.domain.dto.ProductDto;
import com.warehouse.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<ProductDto> getAll(){

        return new ArrayList<>();

    }

    public ProductDto getById(int Id){

        return new ProductDto();

    }

    @Override
    public ProductDto add(ProductDto productDTO) {
        return productDTO;
    }

    @Override
    public ProductDto update(int id, ProductDto productDTO) {
        return productDTO;
    }

    @Override
    public void delete(int id) {

    }


}
