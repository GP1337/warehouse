package com.warehouse.dto;

import com.warehouse.model.Unit;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BalanceDto {

    private int productId;
    private double value;
    private Unit unit;

}
