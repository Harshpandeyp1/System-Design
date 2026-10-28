package notification;

import channel.MessageChannel;

public abstract class Notification {
    protected final MessageChannel channel;

    protected Notification(MessageChannel channel) {
        this.channel = channel;
    }
    public abstract void send(String message);
}
