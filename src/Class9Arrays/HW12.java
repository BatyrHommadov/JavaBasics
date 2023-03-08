package Class9Arrays;

import java.util.Scanner;

public class HW12 {
    public static void main(String[] args) {
        /*
        Task12:
        Create an array of size 5
        use scanner class to take 5 numbers from user and store them inside above array
        print all the elements from above array using a loop
         */

        int[] array=new int[5];
        Scanner scanner=new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a number");
            array[i]= scanner.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");

        }
    }
}
