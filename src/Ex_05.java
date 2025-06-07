/* Write a program that calculates and displays the letter grade
   for a given numerical score (e.g., A, B, C, D, or F) based on
   the following grading scale:

    A: 90-100
    B: 80-89
    C: 70-79
    D: 60-69
    F: 0-59
 */

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Mark: ");
        Integer mark = sc.nextInt();
        Character Grade;

        if (mark >= 90 && mark <= 100)
        { Grade = 'A'; }
        else if (mark >= 80 && mark < 90)
        { Grade = 'B'; }
        else if (mark >= 70 && mark < 80)
        { Grade = 'C'; }
        else if (mark >= 60 && mark < 70)
        { Grade = 'D'; }
        else
        { Grade = 'F'; }

        System.out.println("Your grade is: " + Grade);

        sc.close();
    }
}
