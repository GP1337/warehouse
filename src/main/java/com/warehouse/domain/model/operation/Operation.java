package com.warehouse.domain.model.operation;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@MappedSuperclass
public abstract class Operation {

    @Id
    protected UUID id = UUID.randomUUID();

    @Column(name = "date")
    protected LocalDateTime date;

}
