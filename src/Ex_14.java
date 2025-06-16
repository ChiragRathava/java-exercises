// String Reverse (Sentence)

import java.util.Scanner;

public class Ex_14 {

    // Helper method
    public static void reverse(char[] arr, int i, int j){
        while (i < j)
        {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void reverseWords(char[] sentence){

        //step - 1
        reverse(sentence, 0, sentence.length - 1);

        //step -2
        int start = 0;
        for (int end = 0; end < sentence.length; end++)
        {
            if(sentence[end] == ' ')
            { reverse(sentence, start, end-1);
                start = end + 1; }
        }

        //step - 3
        reverse(sentence, start, sentence.length - 1);
    }

    // Main Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");

        String input = sc.nextLine();

        char[] sentence = input.toCharArray();
        reverseWords(sentence);

        System.out.println("Reverse sentence: " + new String(sentence));
    }

}
