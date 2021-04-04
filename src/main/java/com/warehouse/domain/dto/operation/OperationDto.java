package com.warehouse.domain.dto.operation;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
public abstract class OperationDto {

    protected UUID id;
    protected LocalDateTime date;
    protected List<OperationDetail> operationDetails;

}
