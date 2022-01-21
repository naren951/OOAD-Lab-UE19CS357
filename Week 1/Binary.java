package OOAD;
import java.util.Scanner;
public class Binary{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        bcount(num);
        input.close();
    }
    public static void bcount(int num){
        int count = 0;
        while(num!=0){
            if(num%2!=0) count++;
            num=num/2;
        }
        System.out.println(count);
    }
}