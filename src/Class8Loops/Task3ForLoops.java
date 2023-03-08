package Class8Loops;

public class Task3ForLoops {
    public static void main(String[] args) {
        /*
        Print out odd numbers from 1 to 9 using a while loop

        Initialize a variable num to 1.
        Write a while loop that continues as long as num is less than or equal to 9.
        Inside the loop, use an if statement to check if num is odd.
        If num is odd, print out its value.
        Increment num by 2 (since the next odd number will be num + 2).
        Run the program and verify that it prints out the odd numbers 1, 3, 5, 7, and 9 on separate lines.
         */
        for (int i = 1; i <= 9; i+=2) {
            if(i%2==1){
                System.out.println(i);
            }

        }
    }
}
