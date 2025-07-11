// How would you iterate through the entries of a Hashtable?

package HashTable;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

public class Ex_30 {
    public static void main(String[] args) {

        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1,"Chirag");
        hashtable.put(2,"Rathava");

        Enumeration<Integer> keys = hashtable.keys();
        while (keys.hasMoreElements())
        {
          Integer key = keys.nextElement();
            System.out.println("Key: " + key + " Value: " + hashtable.get(key));
        }

        // Alternatively, using entrySet()
        for (Map.Entry<Integer,String> entry : hashtable.entrySet())
        {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }
    }
}
