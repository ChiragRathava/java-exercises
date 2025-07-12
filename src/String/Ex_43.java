// Prove that String Objects are Immutable

/* String is immutable — once a String object is created, it cannot be modified. */
package String;

public class Ex_43 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = str1;  // Both refer to the same object

        System.out.println("Before modification:");
        System.out.println("str1: " + str1);  // Output: Hello
        System.out.println("str2: " + str2);  // Output: Hello

        str1 = str1.concat(" World");  // This creates a new String object

        System.out.println("\nAfter modification:");
        System.out.println("str1: " + str1);  // Output: Hello World
        System.out.println("str2: " + str2);  // Output: Hello
    }

}
