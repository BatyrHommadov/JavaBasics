package Class9Arrays;

public class HW5 {
    public static void main(String[] args) {
        /*
        Task5
        Create a double array with 5 elements and fill it with random decimal
        values between 1.0 and 5.0. Use a for loop to iterate over the array and
        print out all the values that are greater than 3.0.
         */
        double[] arrays = {1.0, 2.3, 3.1, 4.4, 5.0};
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] > 3.0) {
                System.out.println(arrays[i]);

            }
        }
    }
}

