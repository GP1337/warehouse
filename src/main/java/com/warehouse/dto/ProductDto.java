package com.warehouse.dto;

import com.warehouse.model.Unit;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDto {

    private int id;
    private String name;
    private Unit unit;

}
