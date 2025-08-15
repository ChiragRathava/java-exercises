package Challenges;

import java.util.Arrays;

public class Ex_63 {

    public static int[] plusOne(int[] digits)
    { return helper(digits, digits.length - 1); }

    private static int[] helper(int[] digits, int index) {

        if (index < 0)
        {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        }

        if (digits[index] < 9)
        {
            digits[index]++;
            return digits;
        }

        digits[index] = 0;
        return helper(digits, index - 1);
    }

    public static void main(String[] args) {
        int[] case1 = {1, 2, 3};
        int[] case2 = {9, 9, 9};
        int[] case3 = {4, 3, 9};

        System.out.println(Arrays.toString(plusOne(case1)));
        System.out.println(Arrays.toString(plusOne(case2)));
        System.out.println(Arrays.toString(plusOne(case3)));
    }
}
