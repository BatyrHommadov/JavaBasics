package Class6LogicalOperators;

public class Task6 {
    public static void main(String[] args) {
        /*
         Write a program for a movie theater that determines whether a customer qualifies for a discount based on
    their age and whether they are a student or a senior. If the customer is either a student or a senior, and
    their age is less than or equal to 18 or greater than or equal to 60, then they qualify for a discount.

        int age=45;


        if(age<=18){
            System.out.println("You are a student");
        }else{
            System.out.println("You are an adult");
        }
        if(age>=60){
            System.out.println("You are a senior");
        }
        if(age<=18 || age>=60){
            System.out.println("You qualify for a discount");
         */

        int age=18;
        boolean isStudent=true;

        if(age <= 18 && isStudent || age >= 60){
            System.out.println("You qualify for a discount");

        }
    }
}
