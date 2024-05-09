package org.example.benchmark;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
public class BenchmarkApplication {

    public static void main(String[] args) {
        SpringApplication.run(BenchmarkApplication.class, args);
    }
}

@RestController
class BenchmarkController {

    private static final long MAX_ITERATIONS = 1_000_000_000;

    @GetMapping("/")
    public String benchmark() {
        long startTime = System.currentTimeMillis();
        long endTime = startTime + 60000;

        long index = 0;

        while (true) {
            double x = Math.sqrt(index);
            long now = System.currentTimeMillis();
            if (now > endTime) {
                break;
            }
            index++;
        }
        if (index <= MAX_ITERATIONS) {
            return "Your PC is need to be changed";
        }

        return index + " Loops In One Minute.";
    }
}
