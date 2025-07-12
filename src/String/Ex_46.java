// Reverse a String

package String;

public class Ex_46 {
    public static void main(String[] args) {
        String str = "Hello";

        String reverse_str = new StringBuilder(str).reverse().toString();

        System.out.println("Revers String: " + reverse_str);
    }
}
