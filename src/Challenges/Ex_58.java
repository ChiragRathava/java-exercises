package Challenges;

import java.util.Scanner;

public class Ex_58 {

    public static boolean is_Rotations(String s1, String s2){

        if (s1 == null || s2 == null || s1.length() != s2.length())
        { return false; }

        String doubled  = s1 + s1;
        return doubled.contains(s2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input String 1: ");
        String s1 = sc.nextLine();

        System.out.print("Input String 2: ");
        String s2 = sc.nextLine();

        System.out.print("Result: ");

        System.out.println(is_Rotations(s1,s2));

    }
}

