// How do you iterate over a Map in Java?

package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Ex_28 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("Chirag",21);
        map.put("Paresh",28);
        map.put("Viju",25);

        for (Map.Entry<String,Integer> entry: map.entrySet())
        { System.out.println(entry.getKey() + ":" + entry.getValue()); }
    }
}
