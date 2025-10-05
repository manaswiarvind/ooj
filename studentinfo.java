import java.util.Scanner;
class Student{
    String usn;
    String name;
    int marks;
    Scanner input=new Scanner(System.in);
    void accept(){
System.out.println("enter usn");
usn=input.nextLine();
System.out.println("enter name");
name=input.nextLine();
System.out.println("enter marks");
marks=input.nextInt();
    }

    void display(){
        System.out.println("usn is "+usn);
        System.out.println("name is "+name);
        System.out.println("marks are "+marks);
    }
}
public class studentinfo {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter no of students");
        int n=input.nextInt();
        Student[] students=new Student[n];
        for(int i=0;i<n;i++){
            students[i]=new Student();
        }
        for(int i=0;i<n;i++){
            students[i].accept();
            students[i].display();
        }
    }
}
