package Class9Arrays;

public class Example2 {
    public static void main(String[] args) {
        /*
        if else
        loops
        arrays
        classes and method - these for are most commonly used in software testing practice
         */

        int [] numbers={10,20,45,67};
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[1]);
        System.out.println(numbers[0]);
        System.out.println(("*******************"));

        System.out.println(numbers.length); //gives the number of elements in the array

        for (int i = 0; i <= numbers.length; i++) {
            System.out.println(i);

        }
    }
}
