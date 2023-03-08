package Class10ArraysAndScanner;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        /*
        Task1:
    1)Create an empty array of integers having size 5
    2) use a for loop to store number 10 on all the indexes
    3) write a separate loop to print all the elements from the array
         */
        int [] array=new int[5];
        Scanner input=new Scanner(System.in);

        for (int i = 0; i <array.length ; i++) {
            System.out.println("Enter a number");
            array[i]= input.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");

        }
    }
}
