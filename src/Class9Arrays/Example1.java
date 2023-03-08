package Class9Arrays;

import java.util.Arrays;

public class Example1 {
    public static void main(String[] args) {

        String name="Patrick";

        String name4=""; //initializing the variable with empty String
        String name5; //not initializing the variable
        String [] names={}; //initializing the array with zero elements
        String [] names2; //not initializing the variable
        /*
        creates an array and initializing it with four elements
         */
        String[] testers={"Usman", "Sarah", "Patrick", "Charles"};
        System.out.println(testers[0]);
        System.out.println(Arrays.toString(testers));

    }
}
