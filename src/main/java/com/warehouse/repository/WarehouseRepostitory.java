package com.warehouse.repository;

import com.warehouse.domain.model.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface WarehouseRepostitory extends JpaRepository<Warehouse, UUID> {
}
