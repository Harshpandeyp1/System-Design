import java.util.HashMap;
import java.util.Map;

public class EnemyRegistry {
    private final Map<String, Enemy> templates = new HashMap<>();

    public void register(String key, Enemy prototype) {
        templates.put(key, prototype);
    }

    public Enemy create(String key) {
        Enemy template = templates.get(key);
        if (template == null) {
            throw new IllegalArgumentException("No template: " + key);
        }
        return template.copy();
    }
}