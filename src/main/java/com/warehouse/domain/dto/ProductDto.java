package com.warehouse.domain.dto;

import com.warehouse.domain.enums.Unit;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class ProductDto {

    private UUID id;
    private String name;
    private Unit unit;

}
