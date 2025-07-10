// How do you convert a List to a Set?

package List;

import java.util.*;

public class Ex_25 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Orange","apple","banana","apple"));
        Set<String> set = new HashSet<>(list);

        System.out.println("List: " + list);
        System.out.println("Set: " + set);
    }
}
