import java.util.List;

public class InfantryUnit extends Unit {

    public InfantryUnit(String name, int attack, int defense, List<String> abilities) {
        super(name, attack, defense, abilities);
    }

    private InfantryUnit(InfantryUnit source) {
        super(source);
    }

    @Override
    public Unit clone() {
        return new InfantryUnit(this);
    }
}