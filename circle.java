import java.util.Scanner;

class Shape{
    int radius;
    int length;
    int breadth;
    int height;


        Scanner input =new Scanner(System.in);
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
            System.out.println("enter radius");
            radius=input.nextInt();
            double area=3.14*radius*radius;
            System.out.println("area of circle is"+area);
        }

        void rectangle(){
            System.out.println("enter length and breadth");
            length=input.
        }

}

public class circle {
    
}
