package com.warehouse.repository;

import com.warehouse.domain.model.operation.Receipt;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ReceiptRepisitory extends JpaRepository<Receipt, UUID> {
}
