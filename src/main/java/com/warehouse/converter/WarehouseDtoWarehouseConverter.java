package com.warehouse.converter;

import com.warehouse.domain.dto.WarehouseDto;
import com.warehouse.domain.model.Warehouse;
import org.springframework.core.convert.converter.Converter;

public class WarehouseDtoWarehouseConverter implements Converter<WarehouseDto, Warehouse> {
    @Override
    public Warehouse convert(WarehouseDto warehouseDto) {

        var warehouse = new Warehouse();
        warehouse.setName(warehouseDto.getName());

        if (warehouseDto.getId() != null) {
            warehouse.setId(warehouseDto.getId());
        }
        return warehouse;

    }
}
