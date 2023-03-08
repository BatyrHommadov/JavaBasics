package Class9Arrays;

public class Example3WhileLoop {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 45, 67};
        //print all the elements from this array with the help of a while loop


        int i=0;
        while(i<numbers.length){
            System.out.println(numbers[i]);
            i++;

        }
    }
}
