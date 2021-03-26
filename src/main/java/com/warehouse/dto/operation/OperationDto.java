package com.warehouse.dto.operation;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public abstract class OperationDto {

    protected int id;
    protected LocalDateTime date;
    protected List<OperationDetail> operationDetails;

}
