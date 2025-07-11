// How does Hashtable ensure thread safety?

/*
 -> Hashtable is thread-safe because all its methods are synchronized.
 -> Only one thread can access methods like put() or get() at a time.
 -> It uses intrinsic locking (synchronized keyword) on the entire object.
*/


// Discuss its methods like put() and get()?

/*

    public synchronized V put(K key, V value) {
        // Calculates index using key's hashCode
        // Checks if key already exists
        // If exists, replaces value; else, inserts new key-value pair
    }

    public synchronized V get(Object key) {
    // Calculates index using key's hashCode
    // Searches for key in the bucket
    // Returns value if key is found
    }

 */

// Example
package HashTable;

import java.util.Hashtable;

public class Ex_31 {
    public static void main(String[] args) {

        Hashtable<String, String> table = new Hashtable<>();

        Thread t1 = new Thread(
                () -> {
                    table.put("name","Chirag");
                    System.out.println("Thread 1: put name = Chirag");
                }
        );

        Thread t2 = new Thread(
                () -> {
                    String value = table.get("name");
                    System.out.println("Thread 2: get name = " + value);
                }
        );

        t1.start();
        try { Thread.sleep(100); } catch (Exception e) {}
        t2.start();
    }
}
