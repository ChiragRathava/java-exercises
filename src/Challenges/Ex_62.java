package Challenges;

public class Ex_62 {

    public static int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        String haystack1 = "hello";
        String needle1 = "ll";
        System.out.println("Index: " + strStr(haystack1, needle1));

        String haystack2 = "aaaaa";
        String needle2 = "bba";
        System.out.println("Index: " + strStr(haystack2, needle2));
        String haystack3 = "abc";
        String needle3 = "";
        System.out.println("Index: " + strStr(haystack3, needle3));
    }
}
