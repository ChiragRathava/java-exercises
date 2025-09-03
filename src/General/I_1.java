package General;

import java.util.Scanner;

public class I_1 {
    public static void swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swap -> a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        int a = sc.nextInt();

        System.out.print("Enter second number (b): ");
        int b = sc.nextInt();

        // Edge case
        if (a == b) {
            System.out.println("Both numbers are same, swap not needed.");
        } else {
            swap(a, b);
        }

        sc.close();
    }
}
