/**
 * Created by curtismitchell on 5/7/16.
 */

class Dog {
    String name;
    String says;
}

public class Ex5 {

    public static void main(String[] args) {
        Dog spot = new Dog();
        spot.name = "spot";
        spot.says = "Ruff!";

        Dog scruffy = new Dog();
        scruffy.name = "scruffy";
        scruffy.says = "Wurf!";

        System.out.println("The first dog's name is " + spot.name + " and he says " + spot.says);
        System.out.println("The second dog's name is " + scruffy.name + " and he says " + scruffy.says);
    }
}
