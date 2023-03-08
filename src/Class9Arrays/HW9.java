package Class9Arrays;

public class HW9 {
    public static void main(String[] args) {
        /*
        ask9:
        Create an integer array with 10 elements and fill it with random values
        between 1 and 100. Use a for loop to iterate over the array and find the
        sum of all the even numbers.
         */

        int [] array={1,25,30,45,50,65,70,80,90,100};
        int sum=0;

        for (int i = 0; i < array.length; i++) {
            if(array[i]%2==0){
                sum=sum+array[i];
            }
        }
        System.out.println(sum);
    }
}
