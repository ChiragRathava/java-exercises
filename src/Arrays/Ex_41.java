// Odd and Even Numbers from an Array

package Arrays;

public class Ex_41 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4};

        System.out.println("Even Numbers: ");
        for (int number : numbers)
        {
            if (number % 2 == 0)
            { System.out.println(number + " "); }
        }

        System.out.println("Odd Number: ");
        for (int number : numbers)
        {
            if (number % 2 != 0)
            { System.out.println(number + " "); }
        }
    }
}
