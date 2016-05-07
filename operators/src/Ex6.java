/**
 * Created by curtismitchell on 5/7/16.
 */

class DogTest {
    String name;
    String says;
}

public class Ex6 {

    public static void main(String[] args) {
        DogTest spot = new DogTest();
        spot.name = "spot";
        spot.says = "Ruff!";

        DogTest spotCopy = spot;

        System.out.println("does spotCopy equal spot?: " + spot.equals(spotCopy));
        System.out.println("does spotCopy.name equal spot.name?: " + spot.name == spotCopy.name);
        System.out.println("does spotCopy.says equal spot.says?: " + spot.says == spotCopy.says);
    }
}

