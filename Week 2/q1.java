import java.util.Scanner;
public class q1{
    public static void main(String[] args){
        int[] a1 = {1,4,5,7};
        int[] a2 = {10,20,30,40};
        int[] a3 = new int[2];
        int min = Integer.MAX_VALUE;
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        for( int e1:a1){
            for( int e2:a2){
                if(Math.abs(x-e1-e2) < min){
                    min = Math.abs(x-e1-e2);
                    a3[0] = e1;
                    a3[1] = e2;
                }
            }
        }
        System.out.println("("+a3[0]+","+a3[1]+")");
        input.close();
    }
}