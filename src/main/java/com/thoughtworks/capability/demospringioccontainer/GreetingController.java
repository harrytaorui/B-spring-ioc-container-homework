package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GreetingController {

    @Autowired
    private GreetingService greetingService;

    @GetMapping("/greet")
    public String greet() {
        System.out.println(greetingService.hashCode());
        return greetingService.sayHi();
    }


}
