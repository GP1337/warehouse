package com.warehouse.domain.model.balance;

import com.warehouse.domain.model.BaseEntity;
import com.warehouse.domain.model.Product;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "balances")
public class Balance extends BaseEntity {

    @ManyToOne
    @JoinColumn
    protected Product product;

    @Column(name = "value")
    protected double value;

}
