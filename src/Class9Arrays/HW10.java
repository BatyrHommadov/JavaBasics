package Class9Arrays;

public class HW10 {
    public static void main(String[] args) {
        /*
        Create an integer array with 8 elements and fill it with random
        values between 1 and 10. Use a for loop to iterate over the array and
        find the index of the first occurrence of the value 5.
         */
        int[] array = {1, 2, 3, 4, 5, 7, 9, 10};

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 5) {
                System.out.println(array[i]);
                break;
            }
        }
    }
}
