package Class10ArraysAndScanner;

import java.util.Arrays;
import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        /*
        3) write a separate loop to print all the elements from the array
Expected output:
    Please Enter a number
    10
    Please Enter a number
    30
    Please Enter a number
    60
    Please Enter a number
    90
    [10, 30, 60, 90]
         */

        Scanner scanner=new Scanner(System.in);

        int[] numbers=new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number");
            numbers[i]=scanner.nextInt();
        }for (int i = 0; i < numbers.length; i++) {

        }
        System.out.println(Arrays.toString(numbers));
    }
}

