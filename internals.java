package cie;
import java.util.Scanner;


public class internals {
    Scanner input=new Scanner(System.in);
   public int[] internalmarks=new int[5];

    public void setmarks(){
        for(int i=0;i<5;i++){
            System.out.println("enter"+(i+1)+"marks");
            internalmarks[i]=input.nextInt();
        }
    }

    public void get(){
         for(int i=0;i<5;i++){
            System.out.println("marks "+(i+1)+internalmarks[i]);
           
        }
    }
}
