package com.hrpayroll.hrpayroll.services;

import com.hrpayroll.hrpayroll.entities.Payment;
import com.hrpayroll.hrpayroll.entities.Worker;
import com.hrpayroll.hrpayroll.feignclients.WorkerFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PaymentService {
    @Autowired
    private WorkerFeignClient workerFeignClient;

    public Payment getPayment(Long workerId, int days) {
        Worker worker = workerFeignClient.findWorkerById(workerId).getBody();
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }
}
