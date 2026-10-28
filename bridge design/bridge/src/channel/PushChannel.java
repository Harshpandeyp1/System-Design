package channel;

public class PushChannel implements MessageChannel {
    @Override
    public void deliver(String title, String body) {
        System.out.println("PUSH | [" + title + "] " + body);
    }
}