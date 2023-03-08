package Class9Arrays;

public class HW14 {
    public static void main(String[] args) {
        /*
        tough ones not easy
        Task14
        Create an integer array with 10 elements and fill it with random values
        between 1 and 20. Use a for loop to iterate over the array and find the
        largest value.
         */

        int[] array = {3, 5, 6, 8, 9, 10, 12, 14, 18, 20};
        int largest = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) ;
            {
                largest = array[i];
            }
        }
        System.out.println(largest);
    }
}

