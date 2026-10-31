package forest;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    private static final Map<String, TreeType> cache = new HashMap<>();

    public static TreeType getTreeType(String name, String color, String texture) {
        String key = name + "-" + color + "-" + texture;
        TreeType type = cache.get(key);
        if (type == null) {
            type = new TreeType(name, color, texture);
            cache.put(key, type);
            System.out.println("Created new TreeType: " + key);
        }
        return type;
    }

    public static int getCacheSize() {
        return cache.size();
    }
}