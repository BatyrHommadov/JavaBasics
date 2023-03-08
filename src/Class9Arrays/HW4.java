package Class9Arrays;

public class HW4 {
    public static void main(String[] args) {
        /*
        Calculate the average of all elements in an array of doubles

        Create an array of doubles with some values
        Initialize a variable to hold the sum to 0.0
        Use a for loop to iterate over all elements in the array
        Add each element to the sum variable
        Divide the sum by the length of the array to calculate the average
        Print out the average
         */
        double [] arrays={2.5,4.5,11.2,14.8};
        double sum=0.0;
        for (int i = 0; i < arrays.length; i++) {
            sum+=arrays[i]/arrays.length;
        }
        System.out.println(sum);
    }
}
