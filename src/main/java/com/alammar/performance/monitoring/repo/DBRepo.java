package com.alammar.performance.monitoring.repo;

import com.alammar.performance.monitoring.annotations.LogExecutionTime;
import org.springframework.stereotype.Component;

@Component
public class DBRepo {

    @LogExecutionTime
    public void loadFromDB() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
