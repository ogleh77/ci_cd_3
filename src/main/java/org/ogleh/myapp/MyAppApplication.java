package org.ogleh.myapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MyAppApplication {

    @GetMapping("/")
    public String greet() {
        return "Asc World!";
    }

    @GetMapping("/{name}")
    public String greetWithName(@PathVariable("name") String name) {
        return "Asc " + name;
    }

    public static void main(String[] args) {
        SpringApplication.run(MyAppApplication.class, args);
    }
}
