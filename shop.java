import java.util.Scanner;

interface discount{
    public double apply(double price);
}

class dis1 implements discount{
    public double apply(double price){
        System.out.println("Price before discount\n");
        price=price-(price*0.2);
        System.out.println("20% discount applied.Final price is\n"+price);
        return price;
    }
}

class dis2 implements discount{
    public double apply(double price){
        System.out.println("Price before discount\n");
        price=price-(price*0.1);
        System.out.println("10% discount applied.Final price is\n"+price);
        return price;
    }
}

class dis3 implements discount{
    public double apply(double price){
        System.out.println("Price before discount\n"+price);
        price=price-(price*0.5);
        System.out.println("50% discount applied.Final price is\n"+price);
        return price;
    }
}
public class shop {

    public static void display(discount d,double price){
        System.out.println(d.apply(price));
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the price\n");
        double price=input.nextDouble();
        discount d1=new dis1();
        discount d2=new dis2();
        discount d3=new dis3(); 

        display(d1,price);
        display(d2,price);
        display(d3,price);
    }
}
