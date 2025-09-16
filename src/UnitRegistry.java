import java.util.HashMap;
import java.util.Map;

public class UnitRegistry {

    private Map<String, Unit> prototypes = new HashMap<>();

    public void registerPrototype(String key, Unit prototype) {
        prototypes.put(key, prototype);
    }

    public Unit getClone(String key) {
        Unit prototype = prototypes.get(key);
        if (prototype != null) {
            return prototype.clone();
        }
        return null;
    }
}