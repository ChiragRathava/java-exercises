/* Table Print using System.out.printf */

// Print lines of output, each line (where) contains the of in the form:
// N x i = result.

import java.util.Scanner;

public class Ex_02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = -1;

      while (true){
           System.out.print("Enter a number: ");
           n = sc.nextInt();

           if(n >= 0)
            {break;}
            else{System.out.println("Number must be greater than 0. Please try again.");}

      }

      for (int i = 1; i <= 10; i++) {
          System.out.printf("%d x %d = %d\n", n, i, n*i);
      }

      sc.close();

    }

}
