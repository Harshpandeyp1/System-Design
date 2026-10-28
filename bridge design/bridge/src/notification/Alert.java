package notification;

import channel.MessageChannel;

public class Alert extends Notification {

    public Alert(MessageChannel channel) {
        super(channel);
    }

    @Override
    public void send(String message) {
        channel.deliver("ALERT!", message.toUpperCase());
    }
}
