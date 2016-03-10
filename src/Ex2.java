/**
 * Created by curtismitchell on 3/9/16.
 */
class Tank {
    float level;
}

public class Ex2 {
    public static void main(String[] args) {
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.level = 11;
        t2.level = 33;

        System.out.println("t1.level: " + t1.level);
        System.out.println("t2.level: " + t2.level);
        t1 = t2;
        System.out.println("t1.level: " + t1.level);
        System.out.println("t2.level: " + t2.level);
        t1.level = 50;
        System.out.println("t1.level: " + t1.level);
        System.out.println("t2.level: " + t2.level);
    }
}
