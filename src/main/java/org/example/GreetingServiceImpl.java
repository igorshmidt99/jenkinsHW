package org.example;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public GreetingDto getGreeting() {
        return GreetingCreator.createDto(new Greeting("Privet"), new User("Vova"));
    }
}
