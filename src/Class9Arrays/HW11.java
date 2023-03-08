package Class9Arrays;

public class HW11 {
    public static void main(String[] args) {
        /*
        Task11:
        Create an integer array with 6 elements and fill it
        with random values between 1 and 10. Use a for loop to iterate over
        the array and find the index of the last occurrence of the value 5.
         */

        int[] array={2,3,4,5,5,9};
        int   index5=0;

        for (int i = array.length-1; i >=0; i--) {
            if(array[i]==5){
                index5=i;
                break;
            }

        }
        System.out.println(index5);
    }
}
