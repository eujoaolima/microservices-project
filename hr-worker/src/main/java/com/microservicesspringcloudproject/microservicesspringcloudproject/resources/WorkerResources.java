package com.microservicesspringcloudproject.microservicesspringcloudproject.resources;

import com.microservicesspringcloudproject.microservicesspringcloudproject.entities.Worker;
import com.microservicesspringcloudproject.microservicesspringcloudproject.repositories.WorkerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/workers")
public class WorkerResources {
    private static Logger logger = LoggerFactory.getLogger(WorkerResources.class);

    @Value("${test.config}")
    private String testConfig;

    @Autowired private Environment env;
    @Autowired private WorkerRepository workerRepository;


    @GetMapping("/configs")
    public ResponseEntity<Void> getConfigs() {
        logger.info("CONFIG: " + testConfig);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<Worker>> findAllWorkers() {
        List<Worker> lstWorker = workerRepository.findAll();

        return ResponseEntity.ok(lstWorker);
    }

    @GetMapping("/{idWorker}")
    public ResponseEntity<Worker> findWorkerById(@PathVariable Long idWorker) {
        Worker worker = workerRepository.findById(idWorker).get();

        try {
            Thread.sleep(3000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        logger.info("PORT: " + env.getProperty("local.server.port"));

        return ResponseEntity.ok(worker);
    }
}
