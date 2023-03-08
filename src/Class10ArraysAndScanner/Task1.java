package Class10ArraysAndScanner;

public class Task1 {
    public static void main(String[] args) {
        /*
        ask 2: Find the sum of all elements in an array of integers

        Create an array of integers with some values using the new syntax that we have just learnt
        Initialize a variable to hold the sum to 0
        Use a for loop to iterate over all elements in the array
        Add each element to the sum variable
        Print out the total sum of all elements
         */

        int [] numbers=new int[6];

        numbers[0]=10;
        numbers[1]=15;
        numbers[2]=20;
        numbers[3]=25;
        numbers[4]=30;
        numbers[5]=33;

        int sum=0;
        for (int i = 0; i < numbers.length; i++) {
            sum+=numbers[i];
        }
        System.out.println(sum);
    }
}
