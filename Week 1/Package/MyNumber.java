package OOAD.Package;

public class MyNumber {
    private int number = 5;
    public int ctor(){
        int count = 0;
        while(number!=0){
            if(number%2!=0) count++;
            number=number/2;
        }
        return count;
    } 
    public void display_method(int num){
        System.out.println("Display method: " + num);
    }
}
