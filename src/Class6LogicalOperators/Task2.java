package Class6LogicalOperators;

public class Task2 {
    public static void main(String[] args) {
        /*
        Declare a double variable temperature and assign it any value between 0 and 100.
    Write an if statement that checks if the temperature is between 32 and 70 degrees (inclusive), and print a message to the console indicating that
    the weather is pleasant.
    Write another if statement that checks if the temperature is either below 0 degrees or above 100 degrees, and print a message to the console indicating
    that the weather is extreme.
         */
        int temp=70;
        if(temp>=32 && temp<=70){
            System.out.println("The weather is pleasant");
        }
        if(temp<0 || temp>100){
            System.out.println("The weather is extreme");
        }

    }
}
