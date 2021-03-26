package com.warehouse.dto.operation;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MovementDto extends OperationDto {

    private int warehouseSrcId;
    private int warehouseTargetId;

}
