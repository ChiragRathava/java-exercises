// Remove Leading Zeros

package String;

public class Ex_47 {
    public static void main(String[] args) {
        String str= "000134";

        str = str.replaceFirst("^0+(?!$)", "");

        System.out.println("String without leading zeros: " + str );
    }
}