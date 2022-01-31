import java.util.Arrays;

public class q3{
    public static void main(String[] arg){
        Triangle t1 = new Triangle(3,4,5);
        Triangle t2 = new Triangle(5,4,3);
        if(t1.check() && t2.check())
        {
            System.out.println("Details of Triangle 1:");
            System.out.println("Area :"+t1.area());
            System.out.println("Perimeter :"+t1.perimeter());
            System.out.println("Details of Triangle 2:");
            System.out.println("Area : "+t2.area());
            System.out.println("Perimeter : "+t2.perimeter());
            
            if(t1.equal(t1,t2))
            {
                System.out.println("Triangles are equal");
            }
            else
            {
                System.out.println("Triangles are not equal");
            }
        }
        else
        {
            System.out.println("Triangle cannot be formed");
        }
    }
}

public class Triangle{
    private double s1,s2,s3;
    Triangle(double s1,double s2, double s3){
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }
    double get_s1(){
        return s1;
    }
    double get_s2(){
        return s2;
    }
    double get_s3(){
        return s3;
    }
    void set_s1(double s){
        s1=s;
    }
    void set_s2(double s){
        s2=s;
    }
    void set_s3(double s){
        s3=s;
    }
    Boolean check(){
        if(s1 > 0 && s2 > 0 && s3 > 0){
            if(s1+s2>s3 && s2+s3>s1 && s3+s1>s2){
                return true;
            }
        }
        return false;
    }
    double area(){
        double semi = (s1+s2+s3)/2;
        double s = Math.sqrt(semi*(semi-s1)*(semi-s2)*(semi-s3));
        return s;
    }
    double perimeter(){
        return s1+s2+s3;
    }
    Boolean equal(Triangle t1, Triangle t2){
        {
            double []arr = {t1.s1,t1.s2,t1.s3};
            double []arr2 = {t2.s1,t2.s2,t2.s3};
            Arrays.sort(arr);
            Arrays.sort(arr2);
            if(arr[0] / arr2[0] == arr[1] / arr2[1] &&
                       arr[1] / arr2[1] == arr[2] / arr2[2] &&
                       arr[2] / arr2[2] == arr[0] / arr2[0])
            {
                    return true;
            }
            return false;
        }
    }
}

