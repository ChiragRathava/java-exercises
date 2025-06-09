/* ✅ Count vowels and consonants in a String */

import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("String: ");

        String Word = sc.nextLine();
        String Input = Word.toLowerCase();

        int vowelCount = 0;
        int consonantCount = 0;

        for(int i = 0 ; i < Input.length(); i++)
        {
            char ch = Input.charAt(i);

            if(Character.isLetter(ch))
            {
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                {vowelCount++;}
                else if(ch >= 'a' && ch <= 'z')
                {consonantCount++;}
            }
        }

        System.out.println(vowelCount);
        System.out.println(consonantCount);

        sc.close();
    }
}
