import java.util.Scanner;

class Employee{
    int empid;
    String empname;
    int hoursworked;
    int hourlyrate;

    void accept(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter empid");
        empid=input.nextInt();
        System.out.println("Enter hours worked");
        hoursworked=input.nextInt();
        System.out.println("Enter hourly rate");
        hourlyrate=input.nextInt();

        Scanner input2=new Scanner(System.in);
         System.out.println("Enter empname");
        empname=input2.nextLine();
        input2.close();
        input.close();
    } 

    void display(){
        System.out.println("emp id is"+empid);
        System.out.println("emp name is"+empname);
        System.out.println("hours worked is"+hoursworked);
        System.out.println("hourly rate is"+hourlyrate);
    }
    int totalsalary(){
        int total=hoursworked*hourlyrate;
        return total;
    }
}
public class emp {
    public static void main(String[] args){
    Employee emp=new Employee();
    emp.accept();
    emp.display();
    int total=emp.totalsalary();
    System.out.println("total salary is"+total);
}
}