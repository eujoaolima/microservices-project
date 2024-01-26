package com.microservicesspringcloudproject.microservicesspringcloudproject.resources;

import com.microservicesspringcloudproject.microservicesspringcloudproject.entities.Worker;
import com.microservicesspringcloudproject.microservicesspringcloudproject.repositories.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/workers")
public class WorkerResources {
    @Autowired
    private WorkerRepository workerRepository;

    @GetMapping
    public ResponseEntity<List<Worker>> findAllWorkers() {
        List<Worker> lstWorker = workerRepository.findAll();

        return ResponseEntity.ok(lstWorker);
    }

    @GetMapping("/{idWorker}")
    public ResponseEntity<Worker> findWorkerById(@PathVariable Long idWorker) {
        Worker worker = workerRepository.findById(idWorker).get();

        return ResponseEntity.ok(worker);
    }
}
