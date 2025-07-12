// Remove All White Spaces in a String

package String;

public class Ex_42 {
    public static void main(String[] args) {
        String str = "Geek for geek";

        str = str.replaceAll("\\s","");
        System.out.println("Without a space: '" + str + "'");
    }
}
