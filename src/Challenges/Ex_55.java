// Problem Statement:
// Convert a Roman numeral to an integer.

package Challenges;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex_55 {

    public static int romanToInt(String s){

        Map<Character, Integer> values = new HashMap<>();

        values.put('I',1);
        values.put('V',5);
        values.put('X',10);
        values.put('L',50);
        values.put('C',100);
        values.put('D',500);
        values.put('M',1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++){
            int currentVal = values.get(s.charAt(i));
            int nextVal = (i < s.length() - 1) ? values.get(s.charAt(i + 1)) : 0;

            if (currentVal < nextVal) { result -= currentVal; }
            else { result += currentVal; }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Roman numeral: ");
        String roman = sc.nextLine().toUpperCase();

        int result = romanToInt(roman);
        System.out.println("Integer value: " + result);

        System.out.println("\nSample Test Cases");
        System.out.println("III -> " + romanToInt("III"));
        System.out.println("IV -> " + romanToInt("IV"));
        System.out.println("IX -> " + romanToInt("IX"));
        System.out.println("LVII -> " + romanToInt("LVII"));
        System.out.println("MCMXCIV -> " + romanToInt("MCMXCIV"));

    }

}
