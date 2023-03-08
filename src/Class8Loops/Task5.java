package Class8Loops;

public class Task5 {
    public static void main(String[] args) {
        /*
        Print out a countdown from 10 to 1 using a while loop

        Initialize a variable num to 10.
        Write a while loop that continues as long as num is greater than 0.
        Inside the loop, print out the value of num.
        Decrement num by 1.
        Run the program and verify that it prints out the numbers 10 through 1 in descending order.
         */

        int num=10;
        while(num>0){
            System.out.println(num);
            num--;
        }
    }
}
