package com.devfalcon.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devfalcon.hrworker.entities.Worker;

public interface WorkerRepository  extends JpaRepository<Worker, Long>{

}
