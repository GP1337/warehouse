package com.warehouse.domain.model.operation;

import com.warehouse.domain.model.Warehouse;
import com.warehouse.domain.model.operation.details.ReceiptDetail;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "receipts")
public class Receipt extends Operation {

    @OneToMany
    @JoinColumn
    private List<ReceiptDetail> operationDetails;

    @ManyToOne
    @JoinColumn
    private Warehouse warehouse;
}
