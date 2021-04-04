package com.warehouse.domain.model.operation;

import com.warehouse.domain.model.Warehouse;
import com.warehouse.domain.model.operation.details.MovementDetail;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "movements")
public class Movement extends Operation{

    @OneToMany
    @JoinColumn
    private List<MovementDetail> operationDetails;

    @ManyToOne
    @JoinColumn
    private Warehouse warehouseSrc;

    @ManyToOne
    @JoinColumn
    private Warehouse warehouseTarget;
}
