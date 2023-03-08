package Class8Loops;

import java.util.Scanner;

public class Task7ForLoops {
    public static void main(String[] args) {
        /*
        Print out a multiplication table for a given integer using a while loop

    Create a Scanner object to read user input.
    Prompt the user to enter an integer.
    Initialize a variable num to 1.
    Write a while loop that continues as long as num is less than or equal to 10.
    Inside the loop, calculate the product of num and the user input integer.
    Print out a message that says "num x input = product", where num is the current value of the loop variable, input is the integer entered by the user, and product is the product calculated in step 5.
    Increment num by 1.
    Run the program and verify that it prints out a multiplication table for the integer entered by the user.
         */
        Scanner get=new Scanner(System.in);
        System.out.println("Please enter a number");
        int input=get.nextInt();
        System.out.println("The number is "+input);
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(i*input);

        }
    }
}
