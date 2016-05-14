/**
 * Created by curtismitchell on 5/14/16.
 */
public class Ex14 {
    public static void booleanTesting (String str1, String str2) {
        System.out.println("str1: " + str1 + " str2: " + str2);
        System.out.println("str1 == str2: " + str1 == str2);
        System.out.println("str1 != str2: " + str1 != str2);
        System.out.println("str1.equals(str2): " + str1.equals(str2));
    }

    public static void main(String[] args) {
        booleanTesting("Hi", "Hi");
        String s = new String("Hi there");
        booleanTesting("Hi there", s);
    }
}
