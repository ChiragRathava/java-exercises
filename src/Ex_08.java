/* ✅ Right Triangle Star Pattern
    *
    **
    ***
    ****
    *****
 */

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("N = ");

        int N = sc.nextInt();

        if (N <= 0)
        {System.out.println("Positive number");}

        for (int i = 1; i <= N; i++)
        {
            for (int j = 1; j <= i; j++)
            {System.out.print("*");}

            System.out.println();
        }

        sc.close();
    }
}
