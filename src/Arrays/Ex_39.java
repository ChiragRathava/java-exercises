// Find Second Largest Number in an Array

package Arrays;

import java.util.Arrays;

public class Ex_39 {
    public static void main(String[] args) {
        int[] numbers = {12,34,10,1};

        Arrays.sort(numbers);

        System.out.println("Second Largest number: " + numbers[numbers.length - 2]);
    }
}
