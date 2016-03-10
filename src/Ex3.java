/**
 * Created by curtismitchell on 3/9/16.
 */
class FloatNum {
    float f;
}

public class Ex3 {
    static void f(FloatNum n) {
        n.f = 1;
    }

    public static void main(String[] args) {
        FloatNum x = new FloatNum();
        x.f = 21;
        System.out.println("1: x.f: " + x.f);
        f(x);
        System.out.println("2: x.f: " + x.f);
    }
}
