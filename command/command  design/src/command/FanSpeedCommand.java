package command;

import reciever.Fan;

public class FanSpeedCommand implements Command {
    private final Fan fan;
    private final int newSpeed;
    private int previousSpeed;

    public FanSpeedCommand(Fan fan, int newSpeed) {
        this.fan = fan;
        this.newSpeed = newSpeed;
    }

    @Override
    public void execute() {
        previousSpeed = fan.getSpeed();    // save BEFORE changing
        fan.setSpeed(newSpeed);
    }

    @Override
    public void undo() {
        fan.setSpeed(previousSpeed);       // restore
    }
}