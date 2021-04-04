package com.warehouse.controller;

import com.warehouse.domain.dto.BalanceDto;
import com.warehouse.domain.dto.ProductDto;
import com.warehouse.domain.dto.WarehouseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/warehouses")
public class WarehouseController {

    @GetMapping
    public ResponseEntity<List<WarehouseDto>> getAll(){
        return new ResponseEntity(null, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductDto> getById(@PathVariable("id") int id){
        return new ResponseEntity(null, HttpStatus.OK);
    }

    @GetMapping("/{id}/balances")
    public ResponseEntity<BalanceDto> getBalances(@PathVariable("id") int id){
        return new ResponseEntity(null, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<ProductDto> add(@RequestBody WarehouseDto body){
        return new ResponseEntity(null, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProductDto> update(@PathVariable("id") int id, @RequestBody ProductDto body){
        return new ResponseEntity(null, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable("id") int id){

        return new ResponseEntity(HttpStatus.OK);

    }

}
