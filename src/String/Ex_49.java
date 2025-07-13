// Longest Substring Without Repeating Characters

package String;

import java.util.HashSet;

public class Ex_49 {
    public static void main(String[] args) {

        String s = "abcabcbb";
        int maxLength = findLogestSubstring(s);

        System.out.println("Length of longest substring without repeating characters: " + maxLength);
    }

    private static int findLogestSubstring(String s){

        HashSet<Character> set = new HashSet<>();
        int leftPointer = 0;
        int maxlength = 0;

        for (int rightPointer = 0; rightPointer < s.length(); rightPointer++){

            while (set.contains(s.charAt(rightPointer)))
            {
                set.remove(s.charAt(leftPointer));
                leftPointer++;
            }

            set.add(s.charAt(rightPointer));
            maxlength = Math.max(maxlength, rightPointer - leftPointer + 1);
        }
        return maxlength;
    }
}
