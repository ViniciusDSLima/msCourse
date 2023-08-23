package com.example.hrworker.controller;

import com.example.hrworker.domain.Worker;
import com.example.hrworker.repository.WorkerRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("workers")
@AllArgsConstructor
public class WorkerController {

    private WorkerRepository workerRepository;

    @GetMapping
    public ResponseEntity<List<Worker>> findAll(){
        List<Worker> list = workerRepository.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Worker> findAll(@PathVariable Long id){
        var worker = workerRepository.findById(id).get();
        return ResponseEntity.ok(worker);
    }


}
