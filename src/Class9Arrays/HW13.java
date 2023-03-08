package Class9Arrays;

import java.util.Scanner;

public class HW13 {
    public static void main(String[] args) {
        /*
        task13:
        create a variable of type int and call it size
        use scanner to ask the user for the size of array and store that
        in above variable
        create an empty array of that size
        use scanner again to fill that array
        use a loop to print all the elements from above array
         */
        int size;
        System.out.println("What is size of the array?");
        Scanner scanner=new Scanner(System.in);
        size=scanner.nextInt();

        int[] array=new int[size];
        Scanner scanner1=new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter an element");
            array[i]=scanner.nextInt();
        }

        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
