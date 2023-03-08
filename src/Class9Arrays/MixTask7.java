package Class9Arrays;

public class MixTask7 {
    public static void main(String[] args) {
        //5 10 20 25

        for (int i = 5; i <=25 ; i++) {
            if(i%5==0)
                System.out.print(i+" ");
        }
        System.out.println();
        int num=5;
        while(num<=25){
            if(num%5==0)
                System.out.print(num+" ");
            num++;
        }
    }
}
