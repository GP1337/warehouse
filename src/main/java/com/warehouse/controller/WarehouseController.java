package com.warehouse.controller;

import com.warehouse.domain.dto.BalanceDto;
import com.warehouse.domain.dto.ProductDto;
import com.warehouse.domain.dto.WarehouseDto;
import com.warehouse.domain.model.Warehouse;
import com.warehouse.service.warehouse.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/warehouses")
public class WarehouseController extends BaseController {

    private final WarehouseService warehouseService;

    @Autowired
    public WarehouseController(ConversionService conversionService, WarehouseService warehouseService) {
        super(conversionService);
        this.warehouseService = warehouseService;
    }

    @GetMapping
    public ResponseEntity<List<WarehouseDto>> getAll(){

        var warehouseDtoList = warehouseService.getAll().stream()
                .map(warehouse -> conversionService.convert(warehouse, WarehouseDto.class))
                .collect(Collectors.toList());

        return ResponseEntity.ok(warehouseDtoList);

    }

    @GetMapping("/{id}")
    public ResponseEntity<WarehouseDto> getById(@PathVariable("id") UUID id){

        var warehouse = warehouseService.getById(id);

        if (warehouse == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return ResponseEntity.ok(conversionService.convert(warehouse, WarehouseDto.class));

    }

    @GetMapping("/{id}/balances")
    public ResponseEntity<WarehouseDto> getBalances(@PathVariable("id") UUID id){
        return new ResponseEntity(null, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<WarehouseDto> add(@RequestBody WarehouseDto body){

        var warehouseEntity = conversionService.convert(body, Warehouse.class);

        return ResponseEntity.ok(conversionService.convert(warehouseService.add(warehouseEntity), WarehouseDto.class));

    }

    @PutMapping("/{id}")
    public ResponseEntity<WarehouseDto> update(@PathVariable("id") UUID id, @RequestBody ProductDto body){
        return new ResponseEntity(null, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable("id") UUID id){

        return new ResponseEntity(HttpStatus.OK);

    }

}
