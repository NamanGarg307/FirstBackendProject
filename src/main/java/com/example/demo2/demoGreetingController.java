package com.example.demo2;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoGreetingController {
    private static final String template = "Hello ";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public demoGreeting greeting(@RequestParam(value = "R", defaultValue = "Roma") String name) {
        return new demoGreeting(counter.incrementAndGet(), template+name);
    }
}
