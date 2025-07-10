package List;// How do you iterate through a LinkedList?
import java.util.*;
import java.util.Arrays;
import java.util.Iterator;

public class Ex_22 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A","B","C","D"));

        // Using Iterator
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext())
        { System.out.println(iterator.next()); }

        // Using enhaced for loop
        for (String item : list)
        { System.out.println(item); }

        // Using for loop with index
        for (int i = 0; i < list.size(); i++)
        { System.out.println(list.get(i)); }
    }
}
