// Write a function to find the intersection of two lists.

import java.util.*;

public class Ex_23 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(4,5,6,7,8));

        List<Integer> intersection = findInterSection(list1 , list2);
        System.out.println("Intersection: " + intersection);
    }

    public static List<Integer> findInterSection(List<Integer> list1, List<Integer> list2){
        Set<Integer> set1 = new HashSet<>(list1);
        Set<Integer> set2 = new HashSet<>(list2);
        set1.retainAll(set2);
        return new ArrayList<>(set1);
    }
}
