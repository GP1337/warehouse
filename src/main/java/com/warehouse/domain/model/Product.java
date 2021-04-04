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
public class Product {

    @Id
    private UUID id = UUID.randomUUID();

    @Column(name = "name")
    private String name;

    @Enumerated(EnumType.STRING)
    private Unit unit;

}
