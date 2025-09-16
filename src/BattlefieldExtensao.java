import java.util.ArrayList;
import java.util.Arrays;

public class BattlefieldExtensao {

    public static void main(String[] args) {

        UnitRegistry registry = new UnitRegistry();

        System.out.println("--- 1. Registrando protótipos padrão ---");
        registry.registerPrototype("soldado", new InfantryUnit(
                "Soldado",
                100,
                80,
                new ArrayList<>(Arrays.asList("Tiro Preciso", "Granada"))
        ));

        registry.registerPrototype("tank", new TankUnit(
                "Tank",
                250,
                400,
                new ArrayList<>(Arrays.asList("Blindagem", "Longo Alcance"))
        ));

        registry.registerPrototype("caca", new AirUnit(
                "Caça",
                350,
                150,
                new ArrayList<>(Arrays.asList("Mísseis Teleguiados", "Metralhadoras"))
        ));

        System.out.println("Protótipos padrão registrados com sucesso.\n");
        System.out.println("--- 2. Criando um novo protótipo em tempo de execução ---");

        Unit novoPrototipoTanque = registry.getClone("tank");

        System.out.println("Modificando um clone de tank ");
        novoPrototipoTanque.setName("Tank de Laser");
        novoPrototipoTanque.setAttack(450);
        novoPrototipoTanque.setDefense(300);

        novoPrototipoTanque.getAbilities().clear();
        novoPrototipoTanque.getAbilities().add("Canhão de Laser");
        novoPrototipoTanque.getAbilities().add("Escudo de Energia");

        registry.registerPrototype("tank_laser", novoPrototipoTanque);

        System.out.println("Novo protótipo 'tank_laser' registrado!");
        System.out.println("Detalhes do novo protótipo: " + novoPrototipoTanque);

        System.out.println("\n--- 3. Criando exército com protótipos antigos e novos ---");

        Unit tankLaserComandante = registry.getClone("tank_laser");
        tankLaserComandante.setName("Tank Laser Comandante");

        Unit tankPesadoSuporte = registry.getClone("tank");
        tankPesadoSuporte.setName("Tank Pesado de Suporte");

        System.out.println("\nExército final:");
        System.out.println("Novo protótipo: " + tankLaserComandante);
        System.out.println("Antigo protótipo: " + tankPesadoSuporte);
    }
}