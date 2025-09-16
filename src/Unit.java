import java.util.ArrayList;
import java.util.List;

public abstract class Unit implements Prototype {

    private String name;
    private int attack;
    private int defense;
    private List<String> abilities;

    public Unit(String name, int attack, int defense, List<String> abilities) {
        this.name = name;
        this.attack = attack;
        this.defense = defense;
        this.abilities = abilities;
    }

    protected Unit(Unit source) {
        this.name = source.name;
        this.attack = source.attack;
        this.defense = source.defense;
        this.abilities = new ArrayList<>(source.abilities);
    }

    public abstract Unit clone();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public List<String> getAbilities() {
        return abilities;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "name='" + name + '\'' +
                ", attack=" + attack +
                ", defense=" + defense +
                ", abilities=" + abilities +
                '}';
    }
}