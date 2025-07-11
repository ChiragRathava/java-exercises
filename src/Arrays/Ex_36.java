// Print the Smallest Element in an Array

package Arrays;

public class Ex_36 {
    public static void main(String[] args) {
        int[] numbers = {12,34,10,1};
        int min = numbers[0];

        for (int number : numbers)
        {
            if(number < min)
            { min = number; }
        }

        System.out.println("Smallest Element: " + min);
    }
}
