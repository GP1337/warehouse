package com.warehouse.dto.operation;

import java.time.LocalDateTime;
import java.util.List;

public abstract class OperationDto {

    protected int id;
    protected LocalDateTime date;
    protected List<OperationDetail> operationDetails;

}
