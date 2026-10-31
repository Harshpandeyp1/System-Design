import forest.Forest;
import forest.TreeFactory;

public class Main {
    public static void main(String[] args) {
        Forest forest = new Forest();

        forest.plantTree(1, 2, "Oak", "Green", "oak.png");
        forest.plantTree(5, 8, "Oak", "Green", "oak.png");
        forest.plantTree(9, 3, "Pine", "DarkGreen", "pine.png");
        forest.plantTree(4, 7, "Oak", "Green", "oak.png");
        forest.plantTree(6, 1, "Pine", "DarkGreen", "pine.png");

        forest.draw();

        System.out.println("Trees planted: " + forest.size());
        System.out.println("TreeType objects created: " + TreeFactory.getCacheSize());
    }
}