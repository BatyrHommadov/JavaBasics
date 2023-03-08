package Class9Arrays;

public class HW8 {
    public static void main(String[] args) {
        /*
        Task8
        Create an integer array with 8 elements and fill it with random values
        between 1 and 50. Use a for loop to iterate over the array and print out all the values that are less than 25
         */
        int [] array={10, 15, 18, 24, 30, 40, 45, 50};

        for (int i = 0; i < array.length; i++) {
            if(array[i]<25){
                System.out.println(array[i]);
            }

        }
    }
}
