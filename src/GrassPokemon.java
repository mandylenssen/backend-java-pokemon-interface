import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {

    // variabelen
    private static final String type = "grass";
    private static final List<String> attacks = Arrays.asList("leafStorm", "leechSeed", "leaveBlade", "solarBeam");

    // constructor
    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    // methodes
    public void leafStorm(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with leafStorm");

        switch (enemy.getType()) {
            case "water": {
                System.out.println(enemy.getName() + " loses 15 hp");
                enemy.setHp(enemy.getHp() - 15);
            }
            case "fire": {
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp(enemy.getHp() - 10);
            }

            case "electric": {
                System.out.println(enemy.getName() + " loses 8 hp");
                enemy.setHp(enemy.getHp() - 8);
            }

            case "grass": {
                System.out.println(enemy.getName() + " loses 6 hp");
                enemy.setHp(enemy.getHp() - 6);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    // methodes
    public void leechSeed(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with leafSeed");

        switch (enemy.getType()) {
            case "water": {
                System.out.println(enemy.getName() + " loses 25 hp");
                enemy.setHp(enemy.getHp() - 25);
                System.out.println(name.getName() + " gains 25 hp");
                name.setHp(enemy.getHp() + 25);

            }
            case "fire": {
                System.out.println(enemy.getName() + " loses 23 hp");
                enemy.setHp(enemy.getHp() - 23);
                System.out.println(name.getName() + " gains 23 hp");
                name.setHp(enemy.getHp() + 23);
            }

            case "electric": {
                System.out.println(enemy.getName() + " loses 21 hp");
                enemy.setHp(enemy.getHp() - 21);
                System.out.println(name.getName() + " gains 21 hp");
                name.setHp(enemy.getHp() + 21);
            }

            case "grass": {
                System.out.println(enemy.getName() + " loses 19 hp");
                enemy.setHp(enemy.getHp() - 19);
                System.out.println(name.getName() + " gains 19 hp");
                name.setHp(enemy.getHp() + 19);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
        System.out.println(name.getName() + " has " + name.getHp() + " hp left");
    }


    public void leaveBlade(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with leafBlade");

        switch (enemy.getType()) {
            case "water": {
                System.out.println(enemy.getName() + " loses 20 hp");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "fire": {
                System.out.println(enemy.getName() + " loses 18 hp");
                enemy.setHp(enemy.getHp() - 18);
            }

            case "electric": {
                System.out.println(enemy.getName() + " loses 16 hp");
                enemy.setHp(enemy.getHp() - 16);
            }

            case "grass": {
                System.out.println(enemy.getName() + " loses 14 hp");
                enemy.setHp(enemy.getHp() - 14);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

        public void solarBeam(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with solarBeam");

        switch (enemy.getType()) {
        case "water": {
        System.out.println(enemy.getName() + " loses 18 hp");
        enemy.setHp(enemy.getHp() - 28);
        }
        case "fire": {
        System.out.println(enemy.getName() + " loses 16 hp");
        enemy.setHp(enemy.getHp() - 16);
        }

        case "electric": {
        System.out.println(enemy.getName() + " loses 14 hp");
        enemy.setHp(enemy.getHp() - 14);
        }

        case "grass": {
        System.out.println(enemy.getName() + "loses 12 hp");
        enemy.setHp(enemy.getHp() - 12);
        }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
        }

    // getter
    public List<String> getAttacks (){
        return attacks;
    }

}
