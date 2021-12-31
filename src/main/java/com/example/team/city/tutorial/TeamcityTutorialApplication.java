package com.example.team.city.tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@SpringBootApplication
public class TeamcityTutorialApplication {

    @GetMapping
    public ResponseEntity<Map<String, String>> response(){
        HashMap<String, String> response = new HashMap<>();
        response.put("message", "HELLO WORLD");
        return ResponseEntity.ok(response);
    }

    public static void main(String[] args) {
        SpringApplication.run(TeamcityTutorialApplication.class, args);
    }

}
