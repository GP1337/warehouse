package com.warehouse.domain.model;

import com.warehouse.domain.enums.Unit;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "products")
public class Product extends  BaseEntity{

    @Column(name = "name")
    private String name;

    @Enumerated(EnumType.STRING)
    private Unit unit;

}
