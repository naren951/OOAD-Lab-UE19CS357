package OOAD;
import java.util.Scanner;
public class TSA{
    public static void main(String[] args){
        double tsa = 2*Math.PI;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Radius: ");
        double r = input.nextDouble();
        System.out.println("Enter the Height: ");
        double h = input.nextDouble();
        System.out.println("Total Surface Area: "+ tsa*r*(r+h));
        input.close();
    }    
}