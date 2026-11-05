import java.util.ArrayList;
import java.util.List;

public class Enemy implements Prototype<Enemy>{
    private String type;
    private int health;
    private List<String> weapons;
    private int x, y;
    public Enemy(String type, int health, List<String> weapons) {
        this.type = type;
        this.health = health;
        this.weapons = weapons;
        System.out.println("Creating " + type + " (expensive setup...)");
    }
    private Enemy(Enemy other) {
        this.type = other.type;
        this.health = other.health;
        this.weapons = new ArrayList<>(other.weapons);   // DEEP copy
        this.x = other.x;
        this.y = other.y;
    } @Override
    public Enemy copy() {
        return new Enemy(this);
    }

    public void setPosition(int x, int y) { this.x = x; this.y = y; }
    public void addWeapon(String w) { weapons.add(w); }
    @Override
    public String toString() {
        return type + " hp=" + health + " weapons=" + weapons + " at (" + x + "," + y + ")";
    }

}
