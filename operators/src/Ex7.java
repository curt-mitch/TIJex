/**
 * Created by curtismitchell on 5/7/16.
 */

import java.util.*;

public class Ex7 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Random rand = new Random();
            String coin = rand.nextBoolean() == true ? "heads": "tails";
            System.out.println("coin is: " + coin);
        }
    }
}
