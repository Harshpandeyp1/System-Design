package mediator;

import user.User;
import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatMediator {
    private final List<User> users = new ArrayList<>();

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void sendMessage(String message, User sender) {
        for (User u : users) {
            if (u != sender) {            // don't send back to the sender
                u.receive(message, sender.getName());
            }
        }
    }
}