package Class6LogicalOperators;

public class Task1 {
    public static void main(String[] args) {
        /*
        Task1:
    Declare three boolean variables, isHungry, isTired, and isStudying, and assign them any boolean values.
    Write an if statement that checks if both isHungry and isTired are true, and print a message to the console indicating that the person needs to eat and sleep.
    Write another if statement that checks if isStudying is false and either isHungry or isTired is true, and print a message to the console indicating that the
    person should take a break.
         */

        boolean isHungry=true;
        boolean isTired=true;
        boolean isStudying=true;

        if(isHungry && isTired){
            System.out.println("You need to eat and sleep");
        } if(!isStudying || isHungry || isTired){
            System.out.println("You should take a break");
        }
    }
}
