import java.util.ArrayList;
import java.util.Arrays;

public class Battlefield {

    public static void main(String[] args) {

        UnitRegistry registry = new UnitRegistry();

        InfantryUnit soldado = new InfantryUnit(
                "Soldado",
                100,
                80,
                new ArrayList<>(Arrays.asList("Kit médico", "Granada"))
        );

        TankUnit tank = new TankUnit(
                "Tank",
                250,
                400,
                new ArrayList<>(Arrays.asList("Blindagem", "Longo alcance"))
        );

        AirUnit caca = new AirUnit(
                "Caça",
                350,
                150,
                new ArrayList<>(Arrays.asList("Mísseis Teleguiados", "Metralhadoras"))
        );

        registry.registerPrototype("soldado", soldado);
        registry.registerPrototype("tank", tank);
        registry.registerPrototype("caca", caca);

        System.out.println("--- Criando Exército com Clones ---");

        Unit soldado1 = registry.getClone("soldado");
        soldado1.setName("Soldado1");

        Unit soldado2 = registry.getClone("soldado");
        soldado2.setName("Soldado2");

        Unit tankPrincipal = registry.getClone("tank");
        tankPrincipal.setName("Tank Principal");

        System.out.println("Exército Inicial:");
        System.out.println(soldado1);
        System.out.println(soldado2);
        System.out.println(tankPrincipal);

        System.out.println("\n--- Modificando uma Unidade Clonada ---");
        System.out.println("Adicionando nova habilidade ao Soldado 1");

        soldado1.getAbilities().add("Camuflagem");

        System.out.println("\n--- Estado Final do Exército ---");
        System.out.println("Soldado 1(modificado): " + soldado1);
        System.out.println("Soldado 2 (inalterado): " + soldado2);

        System.out.println("\n--- Verificando Protótipo Original ---");
        Unit prototipoOriginal = registry.getClone("soldado");
        System.out.println("Protótipo original (novo clone): " + prototipoOriginal);
    }
}