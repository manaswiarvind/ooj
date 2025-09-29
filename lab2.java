import java.util.Scanner;

 class student{
    String usn;
    String name;
    int[] credits=new int[5];
    int[] marks=new int[5];
    

    void accept(){
        Scanner input=new Scanner(System.in);
        System.out.println("enter usn");
         usn=input.nextLine();
         System.out.println("enter name");
         name=input.nextLine();
         System.out.println("enter credits");
         for(int i=0;i<5;i++){
            credits[i]=input.nextInt();
         }
         System.out.println("enter marks");
         for(int i=0;i<5;i++){
            marks[i]=input.nextInt();
         }
    }

    void display(){
        System.out.println("the details of the student are");
        System.out.println("usn is"+usn);
        System.out.println("name is"+name);
        System.out.println("credits are");
        for(int i=0;i<5;i++){
            System.out.println("credit "+(i+1)+"is"+credits[i]);
        }
         System.out.println("marks are");
        for(int i=0;i<5;i++){
            System.out.println("marks "+(i+1)+"is"+marks[i]);
        }
    }
    double calculatesgpa(){
        int sum=0;
        int creditssum=0;
        for(int i=0;i<5;i++){
            sum+=credits[i]*gradepoint(marks[i]);
            creditssum+=credits[i];
        }
        double sgpa=(sum)/creditssum;
        return sgpa;
    }
    int gradepoint(int marks){
        if(marks>=90)return 10;
        else if(marks>=80)return 9;
        else if(marks>=70)return 8;
        else if(marks>=60)return 7;
        else if(marks>=50)return 6;
        else if(marks>=40)return 5;
        else{
            return 0;
        }
    }
}
public class lab2 {
    public static void main(String[] args){
       student s=new student();
       s.accept();
        s.display();
        double sgpa=s.calculatesgpa();
        System.out.println("sgpa is"+sgpa);
    }
}
