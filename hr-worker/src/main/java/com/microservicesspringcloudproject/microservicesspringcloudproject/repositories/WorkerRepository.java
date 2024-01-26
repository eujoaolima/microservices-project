package com.microservicesspringcloudproject.microservicesspringcloudproject.repositories;

import com.microservicesspringcloudproject.microservicesspringcloudproject.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
