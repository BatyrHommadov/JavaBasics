package Class9Arrays;

public class HW15 {
    public static void main(String[] args) {


    /*
    Task15
    Create a double array with 6 elements and fill it with random decimal
    values between 1.0 and 5.0. Use a for loop to iterate over the array and
    find the smallest value
     */
        double[] array = {1.0, 2.5, 3.3, 4.0, 4.5, 5.0};
        double smallest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest)
            {
                smallest = array[i];
            }
        }
         System.out.println(smallest);
    }
}

