package Class5NestedIf;

public class HW2 {
    public static void main(String[] args) {
        /*
        Create a boolean variable isRaining and assign it a value of true or false.
        create another boolean variable isSunny and assign it a value of true or false.
        Check if isRaining is true using a simple if statement. If it is, print a message saying "It's raining outside". Otherwise, move to the next step.
        If isRaining is not true,
        Check if isSunny is true using a nested if statement. If it is, print a message saying "It's sunny outside".
        Otherwise, print a message saying "It's neither raining nor sunny outside".
         */

        boolean isRaining=false;
        boolean isSunny=true;

        if(isRaining){
            System.out.println("It is raining outside");
        }else{
            if(isSunny){
                System.out.println("It is sunny outside");
            }else{
                System.out.println("It is neither raining nor sunny outside");
            }
        }

    }
}
