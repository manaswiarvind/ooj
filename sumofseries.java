import java.util.Scanner;
public class sumofseries {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number");
        int n=input.nextInt();

        double sum=0.0;
        double i=1.0;
        while(i<=n){
            double l=1/(i*i);
            sum+=l;
            i++;
        }
        System.out.println(sum);
    }
}
