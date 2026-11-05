import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EnemyRegistry registry = new EnemyRegistry();

        List<String> weapons = new ArrayList<>(List.of("Sword"));
        registry.register("orc", new Enemy("Orc", 100, weapons));   // expensive, once

        Enemy e1 = registry.create("orc");     // cheap copy
        Enemy e2 = registry.create("orc");
        e1.setPosition(1, 2);
        e2.setPosition(8, 5);
        e2.addWeapon("Axe");                   // only e2 changes

        System.out.println(e1);
        System.out.println(e2);
    }
}