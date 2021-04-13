package com.warehouse.service.warehouse;

import com.warehouse.domain.model.Warehouse;
import com.warehouse.repository.WarehouseRepostitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class WarehouseServiceImpl implements WarehouseService {

    private final WarehouseRepostitory warehouseRepostitory;

    @Autowired
    public WarehouseServiceImpl(WarehouseRepostitory warehouseRepostitory) {
        this.warehouseRepostitory = warehouseRepostitory;
    }

    @Override
    public Warehouse getById(UUID id) {

        Optional<Warehouse> optionalWarehouse = warehouseRepostitory.findById(id);
        return optionalWarehouse.orElse(null);

    }

    @Override
    public List<Warehouse> getAll() {
        return warehouseRepostitory.findAll();
    }

    @Override
    public Warehouse add(Warehouse object) {
        return warehouseRepostitory.save(object);
    }

    @Override
    public Warehouse update(UUID id, Warehouse object) {
        return null;
    }

    @Override
    public void delete(UUID id) {

    }
}
