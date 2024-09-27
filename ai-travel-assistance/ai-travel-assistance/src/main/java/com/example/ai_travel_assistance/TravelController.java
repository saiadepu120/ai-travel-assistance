package com.example.ai_travel_assistance;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TravelController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, Traveller!";
    }
}
