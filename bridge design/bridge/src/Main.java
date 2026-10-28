import channel.*;
import notification.*;

public class Main {
    public static void main(String[] args) {
        Notification a1 = new Alert(new EmailChannel());
        Notification a2 = new Alert(new SmsChannel());
        Notification r1 = new Remainder(new PushChannel());
        Notification r2 = new Remainder(new EmailChannel());

        a1.send("server is down");
        a2.send("server is down");
        r1.send("meeting at 5 pm");
        r2.send("submit assignment");
    }
}