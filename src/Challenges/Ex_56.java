// Write a function that reverses a string.
// The input string is given as an array of characters s.

package Challenges;

import java.util.Scanner;

public class Ex_56 {
    public static void revers_string(char[] s){
        int left = 0;
        int right = s.length - 1;

        while (left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = sc.nextLine().trim().toLowerCase();

        if (input.isEmpty()) {
            System.out.println("Invalid input: string is empty or only spaces.");
            return;
        }

        char[] s = input.toCharArray();

        revers_string(s);

        System.out.println("Reversed: ");
        for (char c : s){ System.out.print(c + " "); }

        sc.close();
    }
}
