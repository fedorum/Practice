package com.example.rest_service;

// imports the 'AtomicLong' data structure for the id counter
import java.util.concurrent.atomic.AtomicLong;

// imports annotations for the controller to get the mapped parameter for the greeting record
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// this annotation combines the following annotations into a single controller
@RestController
public class GreetingController {

    // this string is a final variable that restricts direct modification
    private static final String template = "Hello, %s!";

    // this long counts the number of times a new Greeting record is initialised
    private final AtomicLong counter = new AtomicLong();

    // this annotation adds a "/greeting" portion to the url
    @GetMapping("/greeting")
    // the @RequestParam annotation binds a name parameter, "?name={}" of the URL, to the name variable of the greeting method
    public Greeting greeting(@RequestParam(defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), template.formatted(name));
    }
}
