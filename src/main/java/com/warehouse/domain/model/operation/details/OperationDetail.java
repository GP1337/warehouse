package com.warehouse.domain.model.operation.details;

import com.warehouse.domain.model.BaseEntity;
import com.warehouse.domain.model.Product;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@MappedSuperclass
public abstract class OperationDetail extends BaseEntity {

    @ManyToOne
    @JoinColumn
    protected Product product;

    @Column(name = "value")
    protected double value;

}
