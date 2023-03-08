package Class7Scanner;

import java.util.Scanner;

public class ClassExamples {
    public static void main(String[] args) {
        /*
        Scanner class is used to take the input from the keyboard and store it in a variables
        For all primitive data types and String class we have methods (nothing but a block of code or a set of statements)
         */
        /*
        Scanner => is the name of the class
        scanner => is a variable just like we create a variable age of type int here fetch
        is a variable of type Scanner
        new=> in java is used to create an object of the class
        Scanner()=> name of the class
        System.in => tells java to take the input from keyboard
         */
        Scanner fetch=new Scanner(System.in);
        //nextInt() is calling the method using the fetch object
        //it will wait for user to enter a number from the keyboard and get it stored inside the age variable

        System.out.println("Please enter your age");
        int age=fetch.nextInt();
        System.out.println("My age is "+age);
    }
}
