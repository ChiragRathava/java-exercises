// Ascending Order Sort of the Array Elements.

package Arrays;

import java.util.Arrays;

public class Ex_38 {
    public static void main(String[] args) {
        int[] numbers = {5,3,8,1};

        Arrays.sort(numbers);

        System.out.println("Sorted Array: ");
        for (int number : numbers)
        { System.out.println(number + " "); }
    }
}
