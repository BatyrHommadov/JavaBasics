package Class4ElseIf;

public class Task2 {
    public static void main(String[] args) {

        /*
        Declare two variables num1 and num2 and assign them values of 5 and 10 respectively.
    Declare a third variable operator and assign it the value "+".
    Write an if statement that checks if the operator variable is equal to "+".
    If the condition is true, print the sum of num1 and num2 to the console.
    Write an else if statement that checks if the operator variable is equal to "-".
    If the condition is true, print the difference of num1 and num2 to the console.
    Write an else if statement that checks if the operator variable is equal to "*".
    If the condition is true, print the product of num1 and num2 to the console.
    Write an else if statement that checks if the operator variable is equal to "/".
    If the condition is true, print the quotient of num1 and num2 to the console.
    Write an else statement that prints "Invalid operator" to the console if none of the above conditions are true.
         */

        int num1=5;
        int num2=10;
        String op="+";

        if(op.equals("+")){
            System.out.println(num1+num2);
        }else if(op.equals("-")){
            System.out.println(num1-num2);
        }else if(op.equals("*")){
            System.out.println(num1*num2);
        }else if(op.equals("/")){
            System.out.println(num1/num2);
        }else{
            System.out.println("Invalid operator");
        }
    }
}
