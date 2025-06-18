// Using LinkedHashSet

import java.util.LinkedHashSet;

public class Ex_15_ {

    public static String remove(String str){

        char[] chars = str.toCharArray();

        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (char ch : chars)
        {set.add(ch);}

        StringBuilder result = new StringBuilder();
        for (char ch : set)
        {result.append(ch);}

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "Hello World";
        String output = remove(input);
        System.out.println(output);
    }
}
