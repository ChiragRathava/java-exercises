/* ✅ Leap Year Checker:
   Create a program that determines whether a given year is a leap year.
   A leap year is divisible by 4,
   but not by 100 unless it is also divisible by 400.
   Use an if-else statement to make this determination.

 */

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Year : ");

        int Year = sc.nextInt();

        if (Year <= 0)
        { System.out.println("Year Must be Positive."); return; }

        boolean isLeapYear = false;

        if ((Year % 4 == 0 && Year % 100 != 0) || (Year % 400 == 0))
        { isLeapYear = true; }

        if (isLeapYear)
        { System.out.println("It's a leap year"); }
        else
        { System.out.println("It's Not a leap year"); }

        sc.close();
    }
}
