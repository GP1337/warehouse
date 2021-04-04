package com.warehouse.repository;

import com.warehouse.domain.model.operation.Movement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ShipmentRepository extends JpaRepository<Movement, UUID> {
}
