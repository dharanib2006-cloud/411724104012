// class Employee{
//     public String name;
//     protected int empid;
//     private double salary;
//     public Employee(String n,int e,double salary){
//         this.name=n;
//         this.empid=e;
//         if(salary<0){
//             this.salary = 0;
//             System.out.println("invalid salary");
//         }else{
//             this.salary= salary;
//             System.out.println(salary);
//         }  
//     }
//     public void SetSalary(double salary){
//         if(salary<0){
//             this.salary = 0;
//             System.out.println("invalid salary");
//         }else{
//             this.salary= salary;
//             System.out.println(salary);
//         }    
        
//     }
//     public void getsalary(){
//         System.out.println(salary);
//     }
    
//     public void displayEmployeeDetails(){
//         System.out.println("name:"+name);
//         System.out.println("employee id:"+empid);
//         System.out.println("total salary:"+salary);
//     }


// }

// public class AccessModifiersEg1 {
//     public static void main(String[] args) {
//         Employee e1 = new Employee("dharu",1001,50000.0);
//         e1.displayEmployeeDetails();
        
//     }
// }


import java.util.*;
class   Employee{
    String empname;
    int empid;
    Employee(String name,int id){
        this.empname=name;
        this.empid=id;
    }
    void  displayDetails(){
            System.out.println("Employee Name:"+empname);
            System.out.println("Employee id:"+empid);
    }
    
}
class  Manager extends Employee  {
    int teamsize;
     Manager(String name,int id,int tsize){
        super(name,id);
        this.teamsize=tsize;

    }
    void displayDetails(){
        super.displayDetails();
        System.out.println("Team size:"+teamsize);
    }
class Engineer extends Employee{
    String specialization;
    Engineer(String name,int id,String specialization){
        super(name,id);
        this.specialization=specialization;
    }
    void displayDetails(){
        super.displayDetails();
        System.out.println("Specialization:"+specialization);
    }

}

}
public class AccessModifiersEg1{
    public static void main(String[] args) {
        Manager m=new Manager("Ram",101,2);
        m.displayDetails();
    }
}