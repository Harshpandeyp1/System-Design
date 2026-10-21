package reciever;

public class Fan {
    private final String location;
    private  int speed=0;
    public Fan(String location) {
        this.location = location;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
        System.out.println(location +"fan speed set to"+speed);
    }
    public int getSpeed(){
        return speed;
    }
}
