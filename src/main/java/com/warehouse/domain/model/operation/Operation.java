package com.warehouse.domain.model.operation;

import com.warehouse.domain.model.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass
public abstract class Operation extends BaseEntity {

    @Column(name = "date")
    protected LocalDateTime date;

}
