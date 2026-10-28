package notification;

import channel.MessageChannel;

public class Remainder extends Notification{
    public Remainder(MessageChannel channel) {
        super(channel);
    }

    @Override
    public void send(String message) {
        channel.deliver("Reminder", "Don't forget: " + message);
    }
}
