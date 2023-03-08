package Class9Arrays;

public class HW2 {
    public static void main(String[] args) {
        /*
        Task 2: Find the sum of all elements in an array of integers

        Create an array of integers with some values
        Initialize a variable to hold the sum to 0
        Use a for loop to iterate over all elements in the array
        Add each element to the sum variable
        Print out the total sum of all elements
         */

        int [] arrays={5,18,23,29};
        int sum=0;
        for (int i = 0; i < arrays.length; i++) {
            sum+=arrays[i];
        }
        System.out.print(sum);
    }
}
