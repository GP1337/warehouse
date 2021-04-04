package com.warehouse.domain.dto.operation;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class ReceiptDto extends OperationDto {

    private UUID warehouseId;
}
