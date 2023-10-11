import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class WaterPokemon extends Pokemon {

    // variabelen
    private static final String type = "electric";
    private static final List<String> attacks = Arrays.asList("surf", "hydroPump", "hydroCanon", "rainDance");

    // constructor
    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }


    // methodes
    void surf(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with surf");

        switch (enemy.getType()) {
            case "fire": {
                System.out.println(enemy.getName() + " loses 20 hp");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "electric": {
                System.out.println(enemy.getName() + " loses 18 hp");
                enemy.setHp(enemy.getHp() - 18);
            }
            case "grass": {
                System.out.println(enemy.getName() + " loses 16 hp");
                enemy.setHp(enemy.getHp() - 16);
            }
            case "water": {
                System.out.println(enemy.getName() + " loses 14 hp");
                enemy.setHp(enemy.getHp() - 14);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }


    void hydroPump(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with hydroPump");

        switch (enemy.getType()) {
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
            case "water": {
                System.out.println(enemy.getName() + " loses 12 hp");
                enemy.setHp(enemy.getHp() - 12);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }


    void hydroCanon(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with hydroCanon");

        switch (enemy.getType()) {
            case "fire": {
                System.out.println(enemy.getName() + " loses 16 hp");
                enemy.setHp(enemy.getHp() - 16);
            }
            case "electric": {
                System.out.println(enemy.getName() + " loses 14 hp");
                enemy.setHp(enemy.getHp() - 14);
            }
            case "grass": {
                System.out.println(enemy.getName() + " loses 12 hp");
                enemy.setHp(enemy.getHp() - 12);
            }
            case "water": {
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp(enemy.getHp() - 10);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    void rainDance(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with rainDance");

        switch (enemy.getType()) {
            case "fire": {
                System.out.println(enemy.getName() + " loses 12 hp");
                enemy.setHp(enemy.getHp() - 12);
            }
            case "electric": {
                System.out.println(" has no effect on " + enemy.getName());
            }
            case "grass": {
                System.out.println(enemy.getName() + " gives hp boost, + 8 hp");
                enemy.setHp(enemy.getHp() + 8);
            }
            case "water": {
                System.out.println(enemy.getName() + " loses 6 hp");
                enemy.setHp(enemy.getHp() - 6);
            }
        }
        System.out.println(enemy.getName() + "has" + enemy.getHp() + " hp left");
    }

    // getter
    public List<String> getAttacks() {
        return attacks;
    }

}
