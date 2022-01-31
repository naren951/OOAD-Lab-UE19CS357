public class q2 {
    public static void main(String[] args){
         Employee e1 = new Employee("Narendiran", "Arthanarieswaran", 300000);
         Employee e2 = new Employee("Abhishek", "Dinesh", 500000);
         System.out.println("Employee 1 details : "+e1.get_fname()+" "+e1.get_lname()+" Salary(yearly): "+e1.get_sal()*12);
         System.out.println("Employee 2 details : "+e2.get_fname()+" "+e2.get_lname()+" Salary(yearly): "+e2.get_sal()*12);
         e1.set_sal(e1.get_sal()*1.1);
         e2.set_sal(e2.get_sal()*1.1);
         System.out.println("After incrementation");
         System.out.println("Employee 1 details : "+e1.get_fname()+" "+e1.get_lname()+" Salary(yearly): "+e1.get_sal()*12);
         System.out.println("Employee 2 details : "+e2.get_fname()+" "+e2.get_lname()+" Salary(yearly): "+e2.get_sal()*12);
         
    }
}

public class Employee{
    private String firstName,lastName;
    private double monthlySalary;
    Employee(String fname,String lname, double sal){
        firstName = fname;
        lastName = lname;
        if(sal>0){
        monthlySalary = sal;
        }
        else{
            monthlySalary = 0;
        }
    }
    void set_fname(String newfname){
        firstName = newfname;
    }
    void set_lname(String newlname){
        lastName = newlname;
    }
    void set_sal(double newSal){
        monthlySalary = newSal;
    }
    String get_fname(){
        return firstName;
    }
    String get_lname(){
        return lastName;
    }
    double get_sal(){
        return monthlySalary;
    }
}