public class Ex_11_ {

    // Method to count vowels and consonants
    public int[] countVowelsCons(String str) {
        int vCount = 0;
        int cCount = 0;

        // Convert the string to lowercase
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vCount++;
            }
            // Check if character is a letter but not a vowel (i.e., consonant)
            else if (ch >= 'a' && ch <= 'z') {
                cCount++;
            }
        }

        // Return the counts in an array
        return new int[]{vCount, cCount};
    }

    // Main method to test the above function
    public static void main(String[] args) {
        Ex_11_ counter = new Ex_11_();
        String input = "Hello World";

        int[] result = counter.countVowelsCons(input);

        System.out.println("Vowels: " + result[0]);
        System.out.println("Consonants: " + result[1]);
    }


}
