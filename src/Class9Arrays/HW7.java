package Class9Arrays;

public class HW7 {
    public static void main(String[] args) {
        /*
        Task7
        Create an integer array with 7 elements and fill it with random values
        between 1 and 10. Use a while loop to iterate over the array and print out
        all the odd numbers.
         */
        int [] array={2,3,5,7,8,9,10};
        int i=0;
        while(i<=10){
            if(array[i]%2==1){
                System.out.println(array[i]);
            }
            i++;
        }
    }
}
