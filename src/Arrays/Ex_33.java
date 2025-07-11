// Duplicate Elements of an Array

package Arrays;

import java.util.HashSet;

public class Ex_33 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,1,2};

        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int number : numbers)
        {
            if (!seen.add(number))
            { duplicates.add(number); }
        }

        System.out.println("Duplicate elements: " + duplicates);
    }
}
// If the number could not be added to the set seen (because it's already there),
// Then this means the number is a duplicate.