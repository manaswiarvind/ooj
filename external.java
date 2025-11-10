package see;
import cie.personal;
import java.util.Scanner;
public class external extends personal{
    Scanner input=new Scanner(System.in);
    public int[] seemarks=new int[5];
   public external(String usn,String name,int sem){
        super(usn,name,sem);
    }
    public void setmarks(){
        for(int i=0;i<5;i++){
            System.out.println("enter"+(i+1)+"marks");
            seemarks[i]=input.nextInt();
        }
    }
        public void get(){
         for(int i=0;i<5;i++){
            System.out.println("marks "+(i+1)+seemarks[i]);
        }
}
}
