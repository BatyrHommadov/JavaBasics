package Class8Loops;

public class Task9 {
    public static void main(String[] args) {

    /*
    Calculate the sum of all odd numbers between 1 and 100 using a while loop

    Initialize a variable num to 1.
I   nitialize a variable sum to 0.
    Write a while loop that continues as long as num is less than or equal to 100.
    Inside the loop, use an if statement to check if num is odd.
    If num is odd, add it to sum.
    Increment num by 1.
    Print out the value of sum.
    Run the program and verify that it correctly calculates the sum of all odd numbers between 1 and 100.
     */

        int num = 1;
        int sum = 0;

        while (num <= 100) {
            if (num % 2 == 1) {
                sum = num + sum;
                System.out.println(sum);
            }
            num++;
        }
    }
}
