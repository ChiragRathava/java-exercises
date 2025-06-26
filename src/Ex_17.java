// ✅ Valid Email Regex

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex_17 {

    public static boolean isValidEmail(String email){
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." +
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$" ;

        Pattern pat = Pattern.compile(emailRegex);
        Matcher mat = pat.matcher(email);
        return mat.matches();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter number of emails to validate:");
        System.out.println("Enter a email");
//        int count = sc.nextInt();
//        sc.nextLine();

//        for (int i = 1; i <= count; i++) {
//            System.out.println("Enter email" + i + ":");

            String email = sc.nextLine();

            if (isValidEmail(email))
            { System.out.println("valid"); }
            else { System.out.println("Not a valid"); }
//        }

        sc.close();
    }

}
