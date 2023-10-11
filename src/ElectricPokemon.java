import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {

    // variabelen
    private static final String type = "electric";
    private static final List<String> attacks = Arrays.asList("voltTackle", "thunderPunch", "electroBall", "thunder");

    //constructor
    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }


    // methodes
    public void voltTackle(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with voltTackle");

        switch (enemy.getType()) {
            case "water": {
                System.out.println(enemy.getName() + " loses 23 hp");
                enemy.setHp(enemy.getHp() - 23);
            }
            case "grass": {
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
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void thunderPunch(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with thunderPunch");

        switch (enemy.getType()) {
            case "water": {
                System.out.println(enemy.getName() + " loses 21 hp");
                enemy.setHp(enemy.getHp() - 21);
            }
            case "grass": {
                System.out.println(enemy.getName() + " loses 20 hp");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "fire": {
                System.out.println(enemy.getName() + " loses 16 hp");
                enemy.setHp(enemy.getHp() - 16);
            }
            case "electric": {
                System.out.println(enemy.getName() + " loses 15 hp");
                enemy.setHp(enemy.getHp() - 15);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void electroBall(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with electroBall");

        switch (enemy.getType()) {
            case "water": {
                System.out.println(enemy.getName() + " loses 20 hp");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "grass": {
                System.out.println(enemy.getName() + " loses 18 hp");
                enemy.setHp(enemy.getHp() - 18);
            }
            case "fire": {
                System.out.println(enemy.getName() + " loses 14 hp");
                enemy.setHp(enemy.getHp() - 14);
            }
            case "electric": {
                System.out.println(enemy.getName() + " loses 12 hp");
                enemy.setHp(enemy.getHp() - 12);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void thunder(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with thunder");

        switch (enemy.getType()) {
            case "water": {
                System.out.println(enemy.getName() + " loses 21 hp");
                enemy.setHp(enemy.getHp() - 21);
            }
            case "grass": {
                System.out.println(enemy.getName() + " loses 19 hp");
                enemy.setHp(enemy.getHp() - 19);
            }
            case "fire": {
                System.out.println(enemy.getName() + " loses 17 hp");
                enemy.setHp(enemy.getHp() - 17);
            }
            case "electric": {
                System.out.println(enemy.getName() + " gains 15 hp");
                enemy.setHp(enemy.getHp() + 15);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }


    // getter
    public List<String> getAttacks (){
        return attacks;
    }

}
