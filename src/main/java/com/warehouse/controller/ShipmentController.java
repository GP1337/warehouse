package com.warehouse.controller;

import com.warehouse.dto.operation.ShipmentDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shipments")
public class ShipmentController {

    @GetMapping
    public ResponseEntity<List<ShipmentDto>> getAll(){
        return new ResponseEntity(null, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ShipmentDto> getById(@PathVariable("id") int id){
        return new ResponseEntity(null, HttpStatus.OK);
    }

    @GetMapping("/{id}/balances")
    public ResponseEntity<ShipmentDto> getBalances(@PathVariable("id") int id){
        return new ResponseEntity(null, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<ShipmentDto> add(@RequestBody ShipmentDto body){
        return new ResponseEntity(null, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ShipmentDto> update(@PathVariable("id") int id, @RequestBody ShipmentDto body){
        return new ResponseEntity(null, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable("id") int id){

        return new ResponseEntity(HttpStatus.OK);

    }

}
