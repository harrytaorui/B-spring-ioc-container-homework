package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.WebApplicationContext;

@RestController
public class GreetingController implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @GetMapping("/greet")
    public String greet() {
        GreetingService greetingService = applicationContext.getBean(GreetingService.class);
        return greetingService.sayHi();
    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
