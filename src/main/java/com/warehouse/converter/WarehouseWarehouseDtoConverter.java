package com.warehouse.converter;

import com.warehouse.domain.dto.WarehouseDto;
import com.warehouse.domain.model.Warehouse;
import org.springframework.core.convert.converter.Converter;

public class WarehouseWarehouseDtoConverter implements Converter<Warehouse, WarehouseDto> {
    @Override
    public WarehouseDto convert(Warehouse warehouse) {

        var warehouseDto = new WarehouseDto();

        warehouseDto.setName(warehouse.getName());
        warehouseDto.setId(warehouse.getId());

        return warehouseDto;

    }
}
