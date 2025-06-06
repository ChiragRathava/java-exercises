import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex_01_EdgeCases {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = "";
        int age = -1;

        // Handle empty or whitespace-only name
        while (true){
            System.out.print("Enter your name: ");
            name = sc.nextLine();

            if(!name.isEmpty() && name.matches("[a-zA-Z ]+"))
            {break;}
            else{System.out.println("Name can't be empty. Please try again.");}
        }

        // Handle non-integer & invalid age input
        while (true){
            System.out.print("Enter your age: ");

            try{
                age = sc.nextInt();

                if(age >= 0 && age <= 100)
                {break;}
                else
                {System.out.println("Age must be between 0 and 100. Please try again.");}

            } catch (InputMismatchException e){
                System.out.println("Age must be an integer. Please try again.");
                sc.next();
            }
        }

        System.out.println("Hello, " + name + "! You are " + age + " years old.");

    }
}
