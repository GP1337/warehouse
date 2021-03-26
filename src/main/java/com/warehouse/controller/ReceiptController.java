package com.warehouse.controller;

import com.warehouse.dto.operation.ReceiptDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/receipts")
public class ReceiptController {

    @GetMapping
    public ResponseEntity<List<ReceiptDto>> getAll(){
        return new ResponseEntity(null, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ReceiptDto> getById(@PathVariable("id") int id){
        return new ResponseEntity(null, HttpStatus.OK);
    }

    @GetMapping("/{id}/balances")
    public ResponseEntity<ReceiptDto> getBalances(@PathVariable("id") int id){
        return new ResponseEntity(null, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<ReceiptDto> add(@RequestBody ReceiptDto body){
        return new ResponseEntity(null, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ReceiptDto> update(@PathVariable("id") int id, @RequestBody ReceiptDto body){
        return new ResponseEntity(null, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable("id") int id){

        return new ResponseEntity(HttpStatus.OK);

    }
}
