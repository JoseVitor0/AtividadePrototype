import java.util.List;

public class TankUnit extends Unit {

    public TankUnit(String name, int attack, int defense, List<String> abilities) {
        super(name, attack, defense, abilities);
    }

    private TankUnit(TankUnit source) {
        super(source);
    }

    @Override
    public Unit clone() {
        return new TankUnit(this);
    }
}