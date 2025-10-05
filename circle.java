import java.util.Scanner;
class Shape{
    int length;
    int breadth;
    int a;
    int b;
    int h;
    int radius;
     Scanner input =new Scanner(System.in);
    void inputcircle(){
            System.out.println("enter radius");
            radius=input.nextInt();
    }
     void inputrectangle(){
             System.out.println("enter length ");
            length=input.nextInt();
            System.out.println("enter breadth");
            breadth=input.nextInt();
    }
     void inputtrapezium(){
            System.out.println("enter first parallel side");
            a=input.nextInt();
            System.out.println("enter another parallel side");
            b=input.nextInt();
            System.out.println("enter height");
            h=input.nextInt();
    }
        void choice(int c){
            if(c==1){
                circle();
            }
            else if(c==2){
                rectangle();
            }
            else if(c==3){
                trapezium();
            }
            else{
                System.out.println("invalid");
            }
        }
        
        void circle(){
            double area=3.14*radius*radius;
            System.out.println("area of circle is"+area);
        }

        void rectangle(){
            double area=length*breadth;
            System.out.println("area of reactangle is"+area);
        }
        void trapezium(){
            double area=0.5*h*(a+b);
            System.out.println("area of trapezium is"+area);
        }

}

public class circle {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter choice 1.circle 2.rectangle 3.trapezium");
        int c=input.nextInt();
         Shape s=new Shape();
        if(c==1){
            s.inputcircle();
        }
        else if(c==2){
            s.inputrectangle();
        }
        else if(c==3){
            s.inputtrapezium();
        }        
        input.close();
        s.choice(c);
    }
}
