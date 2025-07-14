//  Count vowels and consonants in a String

package String;

public class Ex_53 {
    public static void countVowelsAndConsonants(String str){
        int vowels = 0, consonants = 0;
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(Character.isLetter(ch)){
                if("aeiou".indexOf(ch) != -1){ vowels++; }
                else { consonants++; }
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    public static void main(String[] args) {
        String input = "Hello World";
        countVowelsAndConsonants(input);
    }
}
