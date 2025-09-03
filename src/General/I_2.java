package General;

import java.util.Scanner;

public class I_2 {
    public static void checkEvenOdd(int num) {
        if (num % 2 == 0)
            System.out.println(num + " is Even");
        else
            System.out.println(num + " is Odd");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Edge case
        if (num == 0) {
            System.out.println("0 is considered Even.");
        } else {
            checkEvenOdd(num);
        }

        sc.close();
    }
}
