// Count the Number of Words in a String

package String;

public class Ex_44 {
    public static void main(String[] args) {
        String str = "Hello.World! Wellcome to Java.";

        String[] Words = str.split("[\\s\\p{Punct}]+");

        System.out.println("Number of Words: " + Words.length);
    }
}

/*
    \\s → Whitespace ;  space ' ', \t, \n, \r
    \\p{Punct} → Punctuation ; Matches any punctuation character like: . , ! ? : ; ' " - etc.
*/