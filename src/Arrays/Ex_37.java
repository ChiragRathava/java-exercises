// Sum of All Items of the Array

package Arrays;

public class Ex_37 {
    public static void main(String[] args) {
        int[] numbers = {12,34,10};
        int sum = 0 ;

        for (int number : numbers)
        { sum += number; }

        System.out.println("Sum: " + sum);
    }
}
