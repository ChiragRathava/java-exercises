// String is a Palindrome

package String;

public class Ex_45 {
    public static void main(String[] args) {

        String str = "madam";
        String reversed_str = new StringBuilder(str).reverse().toString();

        if (str.equals(reversed_str))
        { System.out.println(str + " is Palindrome"); }
        else
        { System.out.println(str + " is Not Palindrome"); }
    }
}
