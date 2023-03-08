package Class7Scanner;

import java.util.Scanner;

public class AllTypesOfInputs {
    public static void main(String[] args) {
        Scanner fetch=new Scanner(System.in);

        System.out.println("Please enter your age");
        int age=fetch.nextInt();
        System.out.println("Please enter the price of eggs");
        double eggPrice=fetch.nextDouble();
        System.out.println("Please enter your gender");
        char gender=fetch.next().charAt(0);
        System.out.println("Do you like java?");
        boolean likeJava=fetch.nextBoolean();

        System.out.println("Your favorite programming language");
        String language=fetch.next();
        System.out.println("Please enter your address");
        String address=fetch.nextLine();


    }
}
