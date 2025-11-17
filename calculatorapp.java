package app;
import maths.addition;
import science.physics;
public class calculatorapp {
    public static void main(String[] args){
        addition a=new addition();
        physics p=new physics();
        int l=a.add(5,6);
        int m=p.force(8,9);
        System.out.println("addition is\n"+l);
        System.out.println("force is "+m);
    }
}
