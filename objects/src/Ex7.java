/**
 * Created by curtismitchell on 3/2/16.
 */
public class Ex7 {
    class StaticTest {
        static int i = 47;
    }

    static class Incrementable {
        static void increment() { StaticTest.i++; }
    }

    public static void main(String[] args) {
        Incrementable sf = new Incrementable();
        sf.increment();
    }
}
