/* ✅ Triangle Classifier:
    Write a program that classifies a triangle based on its side lengths.
    Given three input values representing the lengths of the sides,
    determine if the triangle is equilateral (all sides are equal),
    isosceles (exactly two sides are equal),
    or scalene (no sides are equal).
    Use an if-else statement to classify the triangle.
 */

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three sides of a triangle:");

        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();

        //Edge case : positive side lengths
        if (side1 <= 0 || side2 <= 0 || side3 <= 0)
        { System.out.println("sides Must be Positive."); return; }

        //Edge case : triangle inequality rule
        if ((side1 + side2 <= side3) ||
            (side1 + side3 <= side2) ||
            (side2 + side3 <= side1))
        {
            System.out.println("Not a valid triangle.");
        }

        if (side1 == side2 && side2 == side3)
        {System.out.println("triangle is equilateral");}
        else if (side1 == side2 || side1 == side3 || side2 == side3)
        {System.out.println("triangle is isosceles");}
        else
        {System.out.println("triangle is scalene");}

        sc.close();
    }
}
