package com.warehouse.domain.model.operation.details;

import com.warehouse.domain.model.Product;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Getter
@Setter
@MappedSuperclass
public abstract class OperationDetail {

    @Id
    protected UUID id = UUID.randomUUID();

    @ManyToOne
    @JoinColumn
    protected Product product;

    @Column(name = "value")
    protected double value;

}
