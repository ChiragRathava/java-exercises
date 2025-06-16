// ✅Palidrome of String using inbuild method

import java.util.Scanner;

public class Ex_13_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  a string: ");

        String input = sc.nextLine();

        String reversed = new StringBuilder(input).reverse().toString();

        if (input.equals(reversed))
        {System.out.println("Yes");}
        else
        {System.out.println("No");}
    }
}
