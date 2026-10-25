package subsystem;

public class NotificationService {
    public void send(String user, String message) {
        System.out.println("Notify " + user + ": " + message);
    }
}