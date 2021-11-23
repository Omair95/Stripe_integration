package com.example.stripe_integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@SpringBootApplication
@RestController
public class StripeIntegrationApplication {

    public static void main(String[] args) {
        SpringApplication.run(StripeIntegrationApplication.class, args);
    }

    @GetMapping("/home-page")
    public ResponseEntity<String> getHomePage() {
        return new ResponseEntity<String>("Hello World folks!", HttpStatus.OK);
    }

    @GetMapping("/test")
    public ResponseEntity<String> getTestString() {
        return new ResponseEntity<String>("Testing!", HttpStatus.OK);
    }

}
