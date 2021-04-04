package com.warehouse.controller;

import com.warehouse.domain.dto.operation.MovementDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movements")
public class MovementController {

    @GetMapping
    public ResponseEntity<List<MovementDto>> getAll(){
        return new ResponseEntity(null, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MovementDto> getById(@PathVariable("id") int id){
        return new ResponseEntity(null, HttpStatus.OK);
    }

    @GetMapping("/{id}/balances")
    public ResponseEntity<MovementDto> getBalances(@PathVariable("id") int id){
        return new ResponseEntity(null, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<MovementDto> add(@RequestBody MovementDto body){
        return new ResponseEntity(null, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<MovementDto> update(@PathVariable("id") int id, @RequestBody MovementDto body){
        return new ResponseEntity(null, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable("id") int id){

        return new ResponseEntity(HttpStatus.OK);

    }

}
