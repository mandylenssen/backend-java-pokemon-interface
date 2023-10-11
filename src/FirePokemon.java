import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {

    // variabelen
    private static final String type = "fire";
    private static final List<String> attacks = Arrays.asList("fireLash", "flameThrower", "pyroBall", "inferno");

    // constructor
    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    // methodes
    void fireLash(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with fireLash");

        switch (enemy.getType()) {
            case "grass": {
                System.out.println(enemy.getName() + " loses 20 hp");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "water": {
                System.out.println(enemy.getName() + " loses 18 hp");
                enemy.setHp(enemy.getHp() - 18);
            }
            case "electric": {
                System.out.println(enemy.getName() + " loses 16 hp");
                enemy.setHp(enemy.getHp() - 16);
            }
            case "fire": {
                System.out.println(enemy.getName() + " loses 14 hp");
                enemy.setHp(enemy.getHp() - 14);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }


    void flameThrower(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with flameThrower");

        switch (enemy.getType()) {
            case "grass": {
                System.out.println(enemy.getName() + " loses 23 hp");
                enemy.setHp(enemy.getHp() - 23);
            }
            case "water": {
                System.out.println(enemy.getName() + " loses 22 hp");
                enemy.setHp(enemy.getHp() - 22);
            }
            case "electric": {
                System.out.println(enemy.getName() + " loses 20 hp");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "fire": {
                System.out.println(enemy.getName() + " loses 18 hp");
                enemy.setHp(enemy.getHp() - 18);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    void pyroBall(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with pyroBall");

        switch (enemy.getType()) {
            case "grass": {
                System.out.println(enemy.getName() + " loses 18 hp");
                enemy.setHp(enemy.getHp() - 18);
            }
            case "water": {
                System.out.println(enemy.getName() + " loses 17 hp");
                enemy.setHp(enemy.getHp() - 17);
            }
            case "electric": {
                System.out.println(enemy.getName() + " loses 15 hp");
                enemy.setHp(enemy.getHp() - 15);
            }
            case "fire": {
                System.out.println(enemy.getName() + " loses 13 hp");
                enemy.setHp(enemy.getHp() - 13);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    void inferno(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with inferno");

        switch (enemy.getType()) {
            case "grass": {
                System.out.println(enemy.getName() + " loses 21 hp");
                enemy.setHp(enemy.getHp() - 21);
            }
            case "water": {
                System.out.println(enemy.getName() + " loses 19 hp");
                enemy.setHp(enemy.getHp() - 19);
            }
            case "electric": {
                System.out.println(enemy.getName() + " loses 17 hp");
                enemy.setHp(enemy.getHp() - 17);
            }
            case "fire": {
                System.out.println(enemy.getName() + " loses 15 hp");
                enemy.setHp(enemy.getHp() - 15);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }


    // getter
    public List<String> getAttacks() {
        return attacks;
    }
}
