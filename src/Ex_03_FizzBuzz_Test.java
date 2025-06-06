/* Write a program that prints numbers from 1 to 100. However, for multiples of 3, print "Fizz"
instead of the number, and for multiples of 5, print "Buzz." For numbers that are multiples of
both 3 and 5, print "FizzBuzz."
 */

import java.util.*;

public class Ex_03_FizzBuzz_Test {

    public static void main(String[] args){

        System.out.println("Print number from 1 to 100");

        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0 && i % 5 == 0) {System.out.println("FizzBuzz");}
            else if (i % 3 == 0) {System.out.println("Fizz");}
            else if (i % 5 == 0) {System.out.println("Buzz");}

            else {System.out.println(i);}

        }
    }

}
