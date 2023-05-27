package org.example;

public class GreetingCreator {

    public static GreetingDto createDto(Greeting greeting, User user) {
        String message = greeting.getMessage();
        greeting.setMessage(String.format("%s, %s!", message, user.getName()));
        return new GreetingDto(greeting.getMessage());
    }
}
