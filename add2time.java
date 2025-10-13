import java.util.Scanner;
class time{
    int hours;
    int mins;
    public time(int hours,int mins){
        this.hours=hours;
        this.mins=mins;
    }
    int totalhrs;
    int totalmins;

    time addtime(time t1,time t2){
        totalhrs=t1.hours+t2.hours;
         totalmins=t1.mins+t2.mins;
        time t=new time(totalhrs,totalmins);
        return t;
    }

    void display(){
        System.out.println("total hrs"+totalhrs);
        System.out.println("total mins"+totalmins);
    }
}
public class add2time {
    public static void main(String args[]){
        time t1=new time(4,13);
        time t2=new time(6,25);
        time t=new time(0,0);
        t.addtime(t1,t2);
        t.display();
    }
}
