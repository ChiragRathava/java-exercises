// Find the Frequency of Each Element in an Array

package Arrays;

import java.util.HashMap;
import java.util.Map;

public class Ex_32 {
    public static void main(String[] args) {

        int[] numbers = {2,2,3,4,5,5,5,3,2,4};
        Map<Integer,Integer> frequencyMap = new HashMap<>();

        for (int number : numbers)
        { frequencyMap.put(number,frequencyMap.getOrDefault(number, 0) + 1); }

        for (Map.Entry<Integer,Integer> entry : frequencyMap.entrySet())
        { System.out.println("Element: " + entry.getKey() + "Frequency: " + entry.getValue()); }
    }
}
