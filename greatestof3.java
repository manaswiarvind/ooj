import java.util.Scanner;
public class greatestof3 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter value of a");
        int a=input.nextInt();
        System.out.println("enter value of b");
        int b=input.nextInt();
        System.out.println("enter value of c");
        int c=input.nextInt();

        if(a>b && a>c){
            System.out.println("the greatest is"+a);
        }
        else if(b>a && b>c){
            System.out.println("the greatest is"+b);
        }
        else{
            System.out.println("the greatest is"+c);
        }
    }
}
