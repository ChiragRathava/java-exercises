/* ✅Prime Number checker

some valid and invalid test cases for the prime number checker in Java:

Valid Test Cases (Prime Numbers):

1. `num = 2` - This is the smallest prime number.
2. `num = 7` - A prime number greater than 2.
3. `num = 13` - Another prime number.
4. `num = 97` - A larger prime number.
5. `num = 101` - Another example of a prime number.

Invalid Test Cases (Non-Prime Numbers):

1. `num = 1` - 1 is not considered a prime number.
2. `num = 4` - It's divisible by 2, so it's not prime.
3. `num = 8` - Also divisible by 2.
4. `num = 15` - Divisible by 3 and 5.
5. `num = 100` - Divisible by 2 and 5.
 */

import javax.swing.*;
import java.util.Scanner;

public class Ex_12 {

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        if (number <= 3) {
            return true;
        }

        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= number; i += 6)
        {
            if (number % i == 0 || number % (i + 2) == 0)
            {return false;}
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int num = sc.nextInt();
        sc.close();

        if (isPrime(num))
        {System.out.println(num + " is a Prime number.");}
        else
        {System.out.println(num + " is not a Prime number.");}
    }

}
