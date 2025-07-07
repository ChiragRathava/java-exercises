// How do you reverse an ArrayList in Java ?

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex_19 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        Collections.reverse(list);
        System.out.println("Reversed ArrayList: " + list);

    }
}
