import java.util.Scanner;
interface payment{
    public boolean process(double amount);
}

class creditcard implements payment{
    public boolean process(double amount){
        if(amount>50000){
            System.out.println("Amount exceeds the limit\n");
            return false;
        }
        else{
            System.out.println("Payment done\n");
            return true;
        }
    }
}

class upi implements payment{
    public boolean process(double amount){
        if(amount>100000){
            System.out.println("Does not accept amount greater than 1,00,000\n");
            return false;
        }
        else{
            System.out.println("Payment done\n");
            return true;
        }
    }
}


public class pay {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        payment p1;
        p1=new creditcard();
        System.out.println("enter amount");
        double am=input.nextDouble();
        p1.process(am);
        p1=new upi();
        System.out.println("enter amount");
        double am1=input.nextDouble();
        p1.process(am1);
    }
}
