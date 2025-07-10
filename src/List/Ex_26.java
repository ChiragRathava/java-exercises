// How do you remove duplicates from a List?

package List;

import java.util.*;

public class Ex_26 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Orange","apple","banana","apple"));
        Set<String> set = new HashSet<>(list);

        list.clear();
        list.addAll(set);

        System.out.println("List: " + list);
    }
}
