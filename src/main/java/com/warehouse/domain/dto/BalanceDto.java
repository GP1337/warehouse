package com.warehouse.domain.dto;

import com.warehouse.domain.enums.Unit;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class BalanceDto {

    private UUID productId;
    private double value;
    private Unit unit;

}
