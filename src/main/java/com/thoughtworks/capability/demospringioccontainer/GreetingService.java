package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class GreetingService {

    public GreetingService() {
        System.out.println("1");
    }
    String sayHi() {
        return "hello world";
    }
}
