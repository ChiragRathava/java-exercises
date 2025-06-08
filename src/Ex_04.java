/*  Create a program that checks whether a given string is a palindrome.
    A palindrome is a word or phrase that reads the same backward as forward (ignoring spaces, punctuation, and capitalization).
    Use an if-else statement to determine if the string is a palindrome.
 */

import java.util.Locale;
import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Take Input: ");
        String Input = sc.nextLine();

        Input = Input.toLowerCase();
        System.out.println(Input);

        String cleaned = "";

        for (int i = 0; i < Input.length(); i++)
        {
            char ch = Input.charAt(i);
            if (Character.isLetterOrDigit(ch))
            { cleaned += ch; }
        }
        System.out.println("Cleaned string: " + cleaned);

        String reversed = "";
        for (int i = cleaned.length() - 1; i >=  0; i--)
        { reversed += cleaned.charAt(i); }
        System.out.println("Reversed string: " + reversed);

        if (cleaned == reversed)
        { System.out.println("It's a palindrome"); }
        else
        { System.out.println("Not a palindrome"); }

        sc.close();
    }
}
