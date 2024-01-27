package com.hrpayroll.hrpayroll.feignclients;

import com.hrpayroll.hrpayroll.entities.Worker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(name = "hr-worker", path = "/workers")
public interface WorkerFeignClient {
    @GetMapping("/{idWorker}")
    ResponseEntity<Worker> findWorkerById(@PathVariable Long idWorker);
}
