import java.util.List;

public class AirUnit extends Unit {

    public AirUnit(String name, int attack, int defense, List<String> abilities) {
        super(name, attack, defense, abilities);
    }

    private AirUnit(AirUnit source) {
        super(source);
    }

    @Override
    public Unit clone() {
        return new AirUnit(this);
    }
}