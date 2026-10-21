import command.*;
import invoker.RemoteControl;
import reciever.Fan;
import reciever.Light;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Light living = new Light("Living room");
        Light kitchen = new Light("Kitchen");
        Fan fan = new Fan("Bedroom");

        RemoteControl remote = new RemoteControl();

        remote.press(new LightOnCommand(living));
        remote.press(new FanSpeedCommand(fan, 3));

        remote.undo();    // fan back to 0
        remote.undo();    // living room light off
        remote.redo();    // living room light on again

        System.out.println("--- Movie Mode ---");
        Command movieMode = new MacroCommand(List.of(
                new LightOnCommand(kitchen),
                new FanSpeedCommand(fan, 2)
        ));
        remote.press(movieMode);
        remote.undo();
    }
}