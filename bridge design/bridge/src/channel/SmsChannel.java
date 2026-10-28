package channel;

public class SmsChannel implements MessageChannel {
    @Override
    public void deliver(String title, String body) {
        System.out.println("SMS | " + title + ": " + body);
    }
}