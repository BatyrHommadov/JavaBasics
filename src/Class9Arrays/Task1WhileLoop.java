package Class9Arrays;

public class Task1WhileLoop {
    public static void main(String[] args) {

        //1) 4 5 6 7 8 9 10 11 - while loop

        int[] numbers = {4, 5, 6, 7, 8, 9, 10, 11};

        int i = 0;
        while (i < numbers.length) {
            System.out.println(numbers[i]);
            i++;
        }
    }
}
