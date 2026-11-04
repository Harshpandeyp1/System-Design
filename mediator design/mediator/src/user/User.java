package user;

import mediator.ChatMediator;

public class User {
    private final String name;
    private final ChatMediator mediator;

    public User(String name, ChatMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public String getName() { return name; }

    public void send(String message) {
        System.out.println(name + " sends: " + message);
        mediator.sendMessage(message, this);      // talks ONLY to the mediator
    }

    public void receive(String message, String from) {
        System.out.println("  " + name + " received from " + from + ": " + message);
    }
}