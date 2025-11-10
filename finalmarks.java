import cie.*;
import see.*;
import java.util.Scanner;

public class finalmarks {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter no.of students");
        int n=input.nextInt();

        personal[] p=new personal[n];
        internals[] in=new internals[n];
        external[] e=new external[n];

        for(int i=0;i<n;i++){
            System.out.println("enter info"+(i+1)+"student");
            input.nextLine();
            System.out.println("enter name");
            String name=input.nextLine();
            System.out.println("Enter usn");
            String usn=input.nextLine();
            System.out.println("Enter sem");
            int sem=input.nextInt();
             p[i]=new personal(usn,name,sem);
            in[i]=new internals();
            e[i]=new external(usn,name,sem);
            in[i].setmarks();
            e[i].setmarks();
        }

        for(int i=0;i<n;i++){
            System.out.println("Display");
            System.out.println("usn"+p[i].usn);
             System.out.println("name"+p[i].name);
             System.out.println("sem"+p[i].sem);
    
            in[i].get();
            e[i].get();
        }
    }
    }
