// Write a program to sort a List of strings in Java.

package List;

import java.util.*;

public class Ex_27 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("banana","apple","Orange"));

        Collections.sort(list);

        System.out.println("Sorted List: " + list);
    }
}
