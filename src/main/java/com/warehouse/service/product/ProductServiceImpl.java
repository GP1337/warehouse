package com.warehouse.service.product;

import com.warehouse.domain.dto.ProductDto;
import com.warehouse.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

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

    @Override
    public ProductDto getById(UUID Id){

        return new ProductDto();

    }

    @Override
    public ProductDto add(ProductDto productDTO) {
        return productDTO;
    }

    @Override
    public ProductDto update(UUID id, ProductDto productDTO) {
        return productDTO;
    }

    @Override
    public void delete(UUID id) {

    }


}
