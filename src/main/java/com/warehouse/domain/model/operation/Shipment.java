package com.warehouse.domain.model.operation;

import com.warehouse.domain.model.Warehouse;
import com.warehouse.domain.model.operation.details.ShipmentDetail;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "shipments")
public class Shipment extends Operation {

    @OneToMany
    @JoinColumn
    private List<ShipmentDetail> operationDetails;

    @ManyToOne
    @JoinColumn
    private Warehouse warehouse;
}
