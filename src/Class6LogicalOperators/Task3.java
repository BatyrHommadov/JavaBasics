package Class6LogicalOperators;

public class Task3 {
    public static void main(String[] args) {
        /*
         Declare three integer variables, num1, num2, and num3, and assign them any integer values.
    Write an if statement that checks if any two of the three numbers are equal, and print a message to the console indicating which numbers are equal.
    Write another if statement that checks if all three numbers are equal, and print a message to the console indicating that all three numbers are equal.
         */

        int num1 = 18;
        int num2 = 18;
        int num3 = 18;

        if (num1 == num2) {

            System.out.println(num1 + " is equal to " + num2);
        }
        else if (num2==num3){

            System.out.println(num2 + " is equal to " +num3);
        } else if (num1 == num3) {

            System.out.println(num1 + " is equal to " + num3);
        }
        if (num1==num2 && num2==num3 && num1==num3){
            System.out.println(num1 + " is equal to " + num2 +" , "+ num2 + " is equal to " + num3+ " and " + num1 + " is equal to " +num3);
        }
    }
}
