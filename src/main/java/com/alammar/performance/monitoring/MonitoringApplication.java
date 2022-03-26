package com.alammar.performance.monitoring;

import com.alammar.performance.monitoring.repo.DBRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MonitoringApplication implements CommandLineRunner {

    @Autowired
    DBRepo dbRepo;

    public static void main(String[] args) {
        SpringApplication.run(MonitoringApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        dbRepo.loadFromDB();
    }
}
