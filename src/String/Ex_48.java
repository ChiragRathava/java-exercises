// First Letter of Each Word in a String

package String;

public class Ex_48 {
    public static void main(String[] args) {
        String str = "Hello World Welcome to Java.";
        StringBuilder firstletters = new StringBuilder();

        for (String word : str.split("\\s+"))
        { firstletters.append(word.charAt(0)); }

        System.out.println("First letters: " + firstletters.toString());
    }
}
