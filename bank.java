import java.util.Scanner;
class account{
    String cust_name;
    double acc_no;
    String acc_type;
    double bal;
    Scanner sc=new Scanner(System.in);
    account(String cust_name,double acc_no,String acc_type,double bal){
        this.cust_name=cust_name;
        this.acc_no=acc_no;
        this.acc_type=acc_type;
        this.bal=bal;
    }

    void display(){
        System.out.println("cust name is"+ cust_name +"acc no is"+ acc_no +"acc type"+acc_type);
    }
    void disbal(){
        System.out.println("balance is"+ bal);
    }

    void deposit() {
            System.out.print("Enter amount to deposit: ");
            double amt = sc.nextDouble();
            bal += amt;
            System.out.println("Amount deposited successfully!");
            disbal();
}
}


class cur_acct extends account{
   double minbal=500;
    double servicechrge=100;
    cur_acct(String name,double acc_no,String acc_type,double bal){
        super(name,acc_no,acc_type,bal);
    }
        void checkbal(){
            if(bal<minbal){
                System.out.println("insufficient bal");
                bal-=servicechrge;
            }
            disbal();
        }
           void withdraw(){
            System.out.println("enter amnt to be withdrawn");
            double amt=sc.nextDouble();
            if(amt>bal){
                System.out.println("insufficient bal");
            }
            else{
                bal=bal-amt;
            }
            disbal();
        }
}
 
class sav_acct extends account{

    sav_acct(String name,double acc_no,String acc_type,double bal){
        super(name,acc_no,acc_type,bal);
    }

        void computeInterest() {
            System.out.print("Enter rate of interest (per annum %): ");
            double rate = sc.nextDouble();
            System.out.print("Enter time in years: ");
            double time = sc.nextDouble();

            double interest = bal * Math.pow((1 + rate / 100), time) - bal;
            bal += interest;
            System.out.println("Compound Interest Rs. " + interest + " added to account.");
            disbal();
}

        void withdraw(){
            System.out.println("enter amnt to be withdrawn");
            double amt=sc.nextDouble();
            if(amt>bal){
                System.out.println("insufficient bal");
            }
            else{
                bal=bal-amt;
            }
            disbal();
        }
}
public class bank {
    public static void main(String[] args){
        cur_acct a;
        a=new cur_acct("manaswi",192838,"curr",10000);
        a.display();
        a.deposit();
        a.checkbal();
        a.withdraw();

        sav_acct s=new sav_acct("Manaswi",3832,"sav",20000);
        s.display();
        s.deposit();
        s.computeInterest();
        s.withdraw();
    }
}
