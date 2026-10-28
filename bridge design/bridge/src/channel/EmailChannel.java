package channel;

public class EmailChannel implements MessageChannel {
    @Override
    public void deliver(String title, String body) {
        System.out.println("EMAIL | Subject: " + title + " | " + body);
    }
}
