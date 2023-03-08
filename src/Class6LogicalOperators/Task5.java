package Class6LogicalOperators;

public class Task5 {
    public static void main(String[] args) {
        /*
        Create an integer variable named age and assign it a value between 0 and 120.
    If age is less than 18, print a message saying "You are not old enough to vote yet".
    If age is between 18 and 64, print a message saying "You are eligible to vote".
    If age is greater than or equal to 65, print a message saying "You are eligible for senior discounts".
         */

        int age=66;

        if(age<=18){
            System.out.println("You are not old enough to vote yet");
        }
        if(age>=18 && age<=64){
            System.out.println("You are eligible to vote");
        }else if(age>=65){
            System.out.println("You are eligible for senior discounts");
        }

    }
}
