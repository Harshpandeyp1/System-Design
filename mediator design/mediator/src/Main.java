import mediator.*;
import user.User;

public class Main {
    public static void main(String[] args) {
        ChatMediator room = new ChatRoom();

        User rahul = new User("Rahul", room);
        User anita = new User("Anita", room);
        User zoya  = new User("Zoya", room);

        room.addUser(rahul);
        room.addUser(anita);
        room.addUser(zoya);

        rahul.send("Hello everyone!");
        anita.send("Hi Rahul!");
    }
}