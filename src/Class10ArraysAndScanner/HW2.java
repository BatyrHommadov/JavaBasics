package Class10ArraysAndScanner;

import java.util.Arrays;
import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        /*
        Task2:
    1)Create an empty array of integers having size 5
    2) Write a for loop that runs 5 times
    3) Inside the loop ask user for a number, store that number in the array
    3) write a separate loop to print all the elements from the array
         */

        int[] numbers = new int[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number");
            numbers[i] = scanner.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");

        }

    }
}
