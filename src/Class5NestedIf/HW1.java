package Class5NestedIf;

public class HW1 {
    public static void main(String[] args) {

        /*
        Create a variable isRaining and set it to true.
        Create a variable isCold and set it to false.
        Create an if statement that checks if isRaining is true. If it is,
        print "Remember to bring an umbrella". If it isn't,
        Add a  nested if statement inside the else part that checks if isCold is true.
        If it is, print "Also, bring a jacket".
         */

        boolean isRaining=true;
        boolean isCold=false;

        if(isRaining==true){
            System.out.println("Remember to bring an umbrella");
        }else{
            if(isCold==true){
                System.out.println("Also, bring a jacket");
            }else{
                System.out.println("End");
            }
        }
    }
}
