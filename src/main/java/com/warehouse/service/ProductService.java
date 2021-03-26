package com.warehouse.service;

import com.warehouse.dto.ProductDto;

import java.util.List;

public interface ProductService {

    public List<ProductDto> getAll();

    public ProductDto getById(int id);

    public ProductDto add(ProductDto productDTO);

    public ProductDto update(int id, ProductDto productDTO);

    public void delete(int id);

}
