package OOAD;
import OOAD.Package.MyNumber;

public class Pkg{
  public static void main(String[] args){
    MyNumber myNum = new MyNumber();
    int ctor = myNum.ctor();
    myNum.display_method(ctor);
  }
}