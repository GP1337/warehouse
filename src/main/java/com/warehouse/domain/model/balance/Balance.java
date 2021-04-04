package com.warehouse.domain.model.balance;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "balances")
public class Balance {

    @Id
    private UUID id = UUID.randomUUID();

}
