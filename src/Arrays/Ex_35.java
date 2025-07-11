// Print the Largest Element in an Array

package Arrays;

public class Ex_35 {
    public static void main(String[] args) {
        int[] numbers = {12,34,10,1};
        int max = numbers[0];

        for (int number : numbers)
        {
            if (number > max)
            { max = number; }
        }

        System.out.println("Largest number: " + max);
    }
}
