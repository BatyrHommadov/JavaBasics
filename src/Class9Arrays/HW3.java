package Class9Arrays;

public class HW3 {
    public static void main(String[] args) {
        /*
        Task 3: Print out all even numbers in an array of integers

        Create an array of integers with some values
        Use a for-each loop to iterate over all elements in the array
        Use an if statement to check if the element is even
        If the element is even, print it out
         */
        int[] arrays = {5, 18, 23, 29};
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] % 2 == 0) {
                System.out.println(arrays[i]);
            }
        }
    }
}
