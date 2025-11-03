abstract class Shape{
    int l;
    int b;
    int r;
    Shape(int r){
        this.r=r;
    }
    Shape(int l,int b){
        this.l=l;
        this.b=b;
    }
    abstract void printArea();
}

class rectangle extends Shape{
    rectangle(int l,int b){
     super(l,b);
    }
    void printArea(){
        int area=l*b;
        System.out.println("Area of rectange is"+area );
    }
}
class triangle extends Shape{
    triangle(int l,int b){
     super( l,b);
    }
    void printArea(){
        double area=0.5*l*b;
        System.out.println("Area of triangle is"+area );
    }
}
class circle extends Shape{
    circle(int r){
     super(r);
    }
    void printArea(){
        double area=3.14*r*r;
        System.out.println("Area of circle is"+area );
    }
}
public class lab5 {
    public static void main(String[] args){
        Shape s;
        s=new rectangle(5,2);
        s.printArea();
        s=new triangle(4,3);
                s.printArea();

        s=new circle(2);
                s.printArea();

    }
}
