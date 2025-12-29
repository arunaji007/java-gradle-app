package com.example.demo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class HealthController {

    @GetMapping("/health")
    public String health() {
        System.out.println("test");
        return "OK";
    }
}
