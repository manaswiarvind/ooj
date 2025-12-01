class thread1 extends Thread{
    public void run(){
        while(true){
        System.out.println("BMS College of Engineering");
    try{
        Thread.sleep(1000);
    }
    catch(InterruptedException e){
        System.out.println(e);
    }
}
    }
}

class thread2 implements Runnable{
    public void run(){
    while(true){
        System.out.println("CSE");
    try{
        Thread.sleep(6000);
    }
    catch(InterruptedException e){
        System.out.println(e);
    }
}
    }
}


public class lab8 {
    public static void main(String [] args){
        Runnable r=new thread2();
        Thread t1=new Thread(r);
        thread1 t2=new thread1();

        t1.start();
        t2.start();
    }
}
